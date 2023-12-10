import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of all elements in the array: " + sum);
        scanner.close();
    }
}
