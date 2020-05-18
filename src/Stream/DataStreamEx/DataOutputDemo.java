package Stream.DataStreamEx;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int empId = 1100;
        

        FileOutputStream fos = new FileOutputStream("testex/new.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.write(empId);

        dos.close();
        fos.close();
        System.out.println("Success");
    }
}
