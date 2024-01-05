package Exam_Prep;

import java.util.*;


public class q5c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PriorityQueue <String> queue = new PriorityQueue<String>();
        System.out.println("Enter 5 strings: ");
        for (int i = 0; i < 5; i++) {
            queue.add(input.next());
        }

        System.out.println("Priority queue: ");
        while (queue.size() > 0) {
            System.out.println(queue.remove());
        }


        //copy prioirity queue to another priority queue
        PriorityQueue <String> queue2 = new PriorityQueue<String>();
        queue2.addAll(queue);

        Iterator<String> iterator = queue2.iterator();
        System.out.println("Priority queue 2: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        input.close();
    }
}
