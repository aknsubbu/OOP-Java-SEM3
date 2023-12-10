package IO_Streams;

import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(System.out)) {
            writer.println("Hello, PrintWriter!");
        }
    }
}
