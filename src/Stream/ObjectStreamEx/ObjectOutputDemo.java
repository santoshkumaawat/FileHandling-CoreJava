package Stream.ObjectStreamEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class ObjectOutputDemo {

    public static void main(String[] args) throws Exception {

        Student stud = new Student(111, "Ramesh", "BCA", 3);
        stud.show();
        FileOutputStream fos = new FileOutputStream("testex/studinfo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(stud);
        oos.close();
        fos.close();
        System.out.println("Object Stored Successfully");
    }
}
