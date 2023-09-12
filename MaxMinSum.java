import java.util.Arrays;
import java.util.Scanner;

public class MaxMinSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];

        System.out.println("Sum of minimum and maximum values: " + (min + max));
        scanner.close();
    }
}
