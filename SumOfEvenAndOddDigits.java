import java.util.Scanner;

public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        scanner.close();
    }
}
