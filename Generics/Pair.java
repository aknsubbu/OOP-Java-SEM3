package Generics;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<Double, String> pair2 = new Pair<>(2.5, "Two Point Five");

        System.out.println("Pair 1: " + pair1.getFirst() + ", " + pair1.getSecond());
        System.out.println("Pair 2: " + pair2.getFirst() + ", " + pair2.getSecond());
    }
}
