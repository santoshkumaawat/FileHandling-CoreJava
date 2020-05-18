package Stream.FileReaderFileWriterEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("testex/file.txt");
        char ch[] = new char[10];
        fr.read(ch);
        for (char c : ch) {
            System.out.print(c);
        }
        fr.close();
        System.out.println("Success");
    }
}
