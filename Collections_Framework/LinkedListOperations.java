package Collections_Framework;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        // Create a LinkedList of animal names
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");

        // i) Insert "cat" at third position.
        animals.add(2, "Cat");

        // ii) Remove the first and last elements.
        animals.removeFirst();
        animals.removeLast();

        // iii) Check if the animal "dog" exists in the linked list.
        boolean containsDog = animals.contains("Dog");
        System.out.println("Contains Dog: " + containsDog);

        // iv) Replace the second element with "Elephant"
        if (animals.size() >= 2) {
            animals.set(1, "Elephant");
        }

        // v) Display the elements and their positions.
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Position " + i + ": " + animals.get(i));
        }
    }
}
