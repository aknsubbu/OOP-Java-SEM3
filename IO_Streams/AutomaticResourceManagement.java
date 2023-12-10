package IO_Streams;

import java.io.*;

public class AutomaticResourceManagement {
    public static void main(String[] args) {
        // Example with BufferedReader (automatically closed)
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
