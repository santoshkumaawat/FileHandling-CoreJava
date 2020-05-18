package Stream.FileStreamEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAndDelete {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("TestEx/abc.txt");
        int size = fis.available();
        System.out.println("Size : " + size);
        byte b[] = new byte[size];
        fis.read(b);
        String s1 = new String(b);
        System.out.println(s1);

        //fis.close();

        System.out.println("Now file is Deleting....");
        File f = new File("TestEx/abc.txt");
        boolean res = f.delete();
        if (res) {
            System.out.println("FILE DELETED ");
        } else {
            System.out.println("CANT DELETE FILE");
        }
    }
}
