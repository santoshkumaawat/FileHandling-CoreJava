package Stream.FileStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SkipData {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileInputStream fis = new FileInputStream("TestEx/demo.txt")) {
            
            System.out.print((char) fis.read());
            System.out.print((char) fis.read());
            System.out.print((char) fis.read());

            fis.skip(2);

            System.out.print((char) fis.read());
            System.out.print((char) fis.read());
            System.out.print((char) fis.read());

            fis.skip(3);

            System.out.print((char) fis.read());
            System.out.print((char) fis.read());
            System.out.print((char) fis.read());
        }
    }
}
