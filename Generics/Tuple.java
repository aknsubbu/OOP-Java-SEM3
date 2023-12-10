package Generics;

public class Tuple<A, B, C> {
    private A first;
    private B second;
    private C third;

    public Tuple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }

    public static void main(String[] args) {
        Tuple<Integer, String, Double> tuple = new Tuple<>(1, "Hello", 3.14);

        System.out.println("Tuple: " + tuple.getFirst() + ", " + tuple.getSecond() + ", " + tuple.getThird());
    }
}
