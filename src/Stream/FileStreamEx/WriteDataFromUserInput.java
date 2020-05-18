package Stream.FileStreamEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataFromUserInput {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city names : ");
        String s1 = sc.nextLine();
        byte b[] = s1.getBytes();

        FileOutputStream fos = new FileOutputStream("testex/city.txt", true);
        
        //fos.write(b);
        fos.write(b, b.length-3, 3);
        fos.close();
        System.out.println("City names Stored");
    }
}
