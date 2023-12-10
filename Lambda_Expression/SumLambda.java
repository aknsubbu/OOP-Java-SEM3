package Lambda_Expression;

public class SumLambda {
    public static void main(String[] args) {
        // Lambda expression to find the sum of two integers
        SumFunction sumFunction = (a, b) -> a + b;

        // Test the lambda expression
        int result = sumFunction.calculateSum(5, 7);
        System.out.println("Sum of 5 and 7: " + result);
    }

    // Functional interface for the sum operation
    interface SumFunction {
        int calculateSum(int a, int b);
    }
}
