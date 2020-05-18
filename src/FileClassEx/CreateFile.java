package FileClassEx;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        File f = new File("TestEx/Demo.txt");
        System.out.println(f.createNewFile());
    }
}
