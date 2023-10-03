public class OverloadingDatatype {
    public static void main(String[] args) {
        System.out.println("Sum of 2.5 and 3.5 is " + sum(2, 3));
        System.out.println("Sum of 2.5, 3.5 and 4.5 is " + sum(2.5, 3.5));
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int sum(int sum1, int sum2) {
        return sum1 + sum2;
    }
}
