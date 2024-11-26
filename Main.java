import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Sorting and Searching Application!");
        System.out.print("Enter the number of integers you want to sort: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            list.add(scanner.nextInt());
        }

        System.out.println("\nChoose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            BubbleSort.sort(list);
        } else if (choice == 2) {
            SelectionSort.sort(list);
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("\nSorted List: " + list);

        System.out.print("\nEnter the number to search for in the sorted list: ");
        int target = scanner.nextInt();
        int position = BinarySearch.search(list, target);

        if (position != -1) {
            System.out.println("Number found at position " + (position + 1) + ".");
        } else {
            System.out.println("Number not found.");
        }

        System.out.println("\nThank you for using the application!");
        scanner.close();
    }
}
