public class Question1Exp4 {
    public static void main(String[] args) {
        int x = 0;
        int y = 20;
        int count = y;
        for (int i = 0; i < count; i++) {
            if (y > 2) {
                x = x + 1;
                y = y - 2;
                System.out.println(x + " " + y);
            } else {
                break;
            }
        }
    }
}
