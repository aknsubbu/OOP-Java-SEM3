package IO_Streams;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("SOURCE.TXT");
             FileOutputStream fos = new FileOutputStream("DESTINATION.TXT")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
