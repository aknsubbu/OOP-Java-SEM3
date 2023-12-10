package IO_Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleStringInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string:");
        String inputString = reader.readLine();
        System.out.println("You entered: " + inputString);
    }
}
