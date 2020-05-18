package Stream.FileReaderFileWriterEx;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("testex/file.txt");
        fw.write("Hello java");
        fw.close();
        System.out.println("Success");
    }
}
