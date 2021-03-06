package Stream.ObjectStreamEx;

public class Student implements java.io.Serializable {

    private int rno;
    private String name;
    private transient String branch;
    private transient int sem;

    public void show() {
        System.out.println("Roll No.   : " + rno);
        System.out.println("Student Name : " + name);
        System.out.println("Branch    : " + branch);
        System.out.println("Semester  : " + sem);
    }

    public Student(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
}
