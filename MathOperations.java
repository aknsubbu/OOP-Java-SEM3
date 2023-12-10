public class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int result1 = math.multiply(5, 10); // Calls the int version
        double result2 = math.multiply(2.5, 3.0); // Calls the double version

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
