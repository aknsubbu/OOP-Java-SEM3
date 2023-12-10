import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the position where you want to insert the element: ");
        int position = scanner.nextInt();
        System.out.print("Enter the element you want to insert: ");
        int element = scanner.nextInt();

        for (int i = n; i > position - 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position - 1] = element;
        n++;

        System.out.println("After inserting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
