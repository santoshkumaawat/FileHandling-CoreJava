package FileClassEx;

import java.io.File;

public class FileClassNonStaticMethods {

    public static void main(String[] args) {
        File f1 = new File("img.png");

        long l = f1.lastModified();
        System.out.println(l);

        java.util.Date date1 = new java.util.Date(l);
        System.out.println(date1);

        java.sql.Date date2 = new java.sql.Date(l);
        System.out.println(date2);

        System.out.println("Exists : " + f1.exists());
        System.out.println("Hidden : " + f1.isHidden());
        System.out.println("Can Write : " + f1.canWrite());
        System.out.println("Can Read : " + f1.canRead());

        //rename file
        File f2 = new File("img.png");
        System.out.println("Rename : " + f1.renameTo(f2));
        
        

    }
}
