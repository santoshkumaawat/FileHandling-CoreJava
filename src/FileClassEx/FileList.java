package FileClassEx;

import java.io.File;
import java.util.Scanner;

public class FileList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter folder path : ");
        String name = sc.nextLine();
        File f = new File(name);
        String s1[] = f.list();
        if (f.isDirectory()) {
            for (String s2 : s1) {
                System.out.println(s2);
            }
        } else {
            System.out.println("Invalid Path");
        }
    }
}
