package Exam_Prep;

import java.util.*;


public class q2b {
    public static class speed{
        float distance;
        float hour;
        float min;
        float sec;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        speed s = new speed();
        System.out.println("Enter distance in km: ");
        s.distance = input.nextFloat();
        System.out.println("Enter time in hours, minutes and seconds: ");
        s.hour = input.nextFloat();
        s.min = input.nextFloat();
        s.sec = input.nextFloat();
        float time = s.hour + s.min/60 + s.sec/3600;
        float speed = s.distance/time;
        System.out.println("Speed in km/hr: " + speed);
        input.close();
        

    }
}
