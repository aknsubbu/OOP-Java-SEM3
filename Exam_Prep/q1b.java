// roll no, sub1, sub2, sub3

package Exam_Prep;

import java.util.*;

public class q1b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int roll = s.nextInt();
        int sub1 = s.nextInt();
        int sub2 = s.nextInt();
        int sub3 = s.nextInt();
        int total = sub1 + sub2 + sub3;
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + total/3);
        s.close();
    }
}