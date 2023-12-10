import java.util.ArrayList;

public class ArrayListDemo {

  public static void main(String[] args) {

    // Create an ArrayList object
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements to ArrayList
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Banana");

    // Print the ArrayList
    System.out.println(fruits);

    // Get element at index
    String fruit = fruits.get(0); 
    System.out.println(fruit);

    // Remove element 
    fruits.remove("Mango");

    // Print ArrayList after removal
    System.out.println(fruits);

    // Size of ArrayList
    int size = fruits.size();
    System.out.println("Size: " + size);
  }
}