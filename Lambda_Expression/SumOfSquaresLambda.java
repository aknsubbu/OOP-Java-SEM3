package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresLambda {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Lambda expressions to calculate the sum of squares of odd and even numbers
        SumOfSquaresFunction oddFunction = list -> list.stream().filter(n -> n % 2 != 0).mapToInt(n -> n * n).sum();
        SumOfSquaresFunction evenFunction = list -> list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();

        // Test the lambda expressions
        int sumOfSquaresOdd = oddFunction.calculateSum(numbers);
        int sumOfSquaresEven = evenFunction.calculateSum(numbers);

        System.out.println("Sum of squares of odd numbers: " + sumOfSquaresOdd);
        System.out.println("Sum of squares of even numbers: " + sumOfSquaresEven);
    }

    // Functional interface for the sum of squares operation
    interface SumOfSquaresFunction {
        int calculateSum(List<Integer> list);
    }
}
