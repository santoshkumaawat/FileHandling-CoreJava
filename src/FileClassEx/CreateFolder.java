package FileClassEx;

import java.io.File;
import java.util.Scanner;
public class CreateFolder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the folder name :");
        String folder = sc.nextLine();

        File f = new File(folder);
        boolean b = f.mkdir();
        if (b) {
            System.out.println("Folder Created");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
