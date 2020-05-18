package Stream.SequenceStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis1 = new FileInputStream("testex/abc.txt");
        FileInputStream fis2 = new FileInputStream("testex/file.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        while (true) {
            int n = sis.read();
            if (n == -1) {
                break;
            }
            System.out.print((char) n);
        }
        fis1.close();
        fis2.close();
        sis.close();
    }
}
