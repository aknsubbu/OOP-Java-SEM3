package Collections_Framework;

import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        // Create a Priority Queue of subject names
        PriorityQueue<String> subjects = new PriorityQueue<>();
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");

        // i) Insert the subject "Mathematics" into the priority queue.
        subjects.add("Mathematics");

        // ii) Iterate through all the elements.
        for (String subject : subjects) {
            System.out.println(subject);
        }

        // iii) Count the number of elements in the priority queue.
        int count = subjects.size();
        System.out.println("Number of elements: " + count);

        // iv) Retrieve the first element.
        String firstElement = subjects.poll();
        System.out.println("First element: " + firstElement);

        // v) Add all the elements of the Priority queue to another Priority queue.
        PriorityQueue<String> anotherQueue = new PriorityQueue<>(subjects);
        System.out.println("Elements in another queue: " + anotherQueue);
    }
}
