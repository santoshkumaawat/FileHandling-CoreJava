package FileClassEx;

import java.io.File;
import java.util.Scanner;

public class FileSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename :");
        String fName = sc.next();
        File f = new File(fName);
        boolean res1 = f.exists();
        if (res1) {
            System.out.print(fName + " is Available. ");
            boolean res2 = f.isFile();
            if (res2) {
                long fLength = f.length();
                System.out.println("Size : " + (fLength / 1024) + "KB");
            } else {
                System.out.println("and it is a folder ");
            }
        } else {
            System.out.println("Invalid Input");

        }
    }
}
