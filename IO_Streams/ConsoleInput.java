package IO_Streams;

import java.io.IOException;

public class ConsoleInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character:");
        int charCode = System.in.read();
        char inputChar = (char) charCode;
        System.out.println("You entered: " + inputChar);
    }
}