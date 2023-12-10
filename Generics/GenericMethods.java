package Generics;

public class GenericMethods {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T, U> void displayPair(Pair<T, U> pair) {
        System.out.println("Pair: " + pair.getFirst() + ", " + pair.getSecond());
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"One", "Two", "Three", "Four", "Five"};

        // Generic method for printing arrays
        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("Double Array: ");
        printArray(doubleArray);

        System.out.print("String Array: ");
        printArray(stringArray);

        // Generic method for displaying Pair
        Pair<Integer, String> pair = new Pair<>(1, "Hello");
        displayPair(pair);
    }
}
