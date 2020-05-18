package Stream.DataStreamEx;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("testex/new.txt");
        DataInputStream dis = new DataInputStream(fis);

        int v1 = dis.readInt();

        System.out.println(v1);

        dis.close();
        fis.close();
    }
}
