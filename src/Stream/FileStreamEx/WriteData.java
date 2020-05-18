package Stream.FileStreamEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //FileOutputStream fos = new FileOutputStream("TestEx/hello.txt");
        FileOutputStream fos = new FileOutputStream("TestEx/hello.txt", true);

        //fos.write(65);
        //fos.write(66);
        //fos.write(67);
        byte b[] = {65, 66, 67, 68, 69, 70};
        fos.write(b);

        fos.close();
        System.out.println("Data Stored");
    }
}
