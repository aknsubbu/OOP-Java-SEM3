package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class MaxMinLambda {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 5, 8, 3, 15);

        // Lambda expressions to find the maximum and minimum values
        MaxFunction maxFunction = list -> list.stream().max(Integer::compare).orElse(null);
        MinFunction minFunction = list -> list.stream().min(Integer::compare).orElse(null);

        // Test the lambda expressions
        Integer maxResult = maxFunction.findMax(numbers);
        Integer minResult = minFunction.findMin(numbers);

        System.out.println("Maximum value: " + maxResult);
        System.out.println("Minimum value: " + minResult);
    }

    // Functional interfaces for the max and min operations
    interface MaxFunction {
        Integer findMax(List<Integer> list);
    }

    interface MinFunction {
        Integer findMin(List<Integer> list);
    }
}
