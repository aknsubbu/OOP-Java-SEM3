import java.util.Scanner;

public class GradeSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int score = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter score: -");
            marks[i] = scanner.nextInt();
            score += marks[i];
        }
        score /= 5;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}
