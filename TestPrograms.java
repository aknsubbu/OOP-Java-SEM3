import java.util.Scanner;

public class TestPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int odd, even;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }

        odd = 0;
        even = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
                System.out.println("Even: " + arr[i] + "\n");

            } else {
                odd += arr[i];
                System.out.println("Odd: " + arr[i] + "\n");
            }
        }

    }
}
