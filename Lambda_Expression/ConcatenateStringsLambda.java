package Lambda_Expression;

public class ConcatenateStringsLambda {
    public static void main(String[] args) {
        // Lambda expression to concatenate two strings
        ConcatenateFunction concatenateFunction = (s1, s2) -> s1 + s2;

        // Test the lambda expression
        String result = concatenateFunction.concatenate("Hello", "World");
        System.out.println("Concatenated String: " + result);
    }

    // Functional interface for the concatenate operation
    interface ConcatenateFunction {
        String concatenate(String s1, String s2);
    }
}
