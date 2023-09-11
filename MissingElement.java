import java.util.Scanner;

public class MissingElement {
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

        int total = (n + 1) * (n + 2) / 2;
        for (int num : arr) {
            total -= num;
        }

        System.out.println("The missing element is: " + total);
    }
}
