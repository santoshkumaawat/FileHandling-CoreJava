package Stream.FileStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataOne {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileInputStream fis = new FileInputStream("TestEx/connectionprovider.java")) {
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
        }
    }
}
