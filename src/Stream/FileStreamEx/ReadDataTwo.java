package Stream.FileStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataTwo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileInputStream fis = new FileInputStream("TestEx/demo.txt")) {
            int size = fis.available();
            System.out.println("Size : " + size);
            byte b[] = new byte[size];
            fis.read(b);
            String s1 = new String(b);
            System.out.println(s1);
        }
    }
}
