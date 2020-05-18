package FileClassEx;

import java.io.File;
import java.util.Scanner;

public class DeleteFiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file or folder name :");
        String fName = sc.nextLine();

        File f = new File(fName);
        boolean b = f.delete();
        if (b) {
            System.out.println("Something Deleted");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
