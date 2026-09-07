class Student {
    int rollno;
    String name;
    double marks;

    Student() {
        this.rollno = 0;
        this.name = "unknown";
        this.marks = 0.0;
    }

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.marks = 0.0;
    }

    Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    void display(String message) {
        System.out.println(message);
        display();
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101, "Hana");
        Student s3 = new Student(102, "Hari", 95.5);

        System.out.println("First Student:");
        s1.display();

        System.out.println("Second Student:");
        s2.display("Student Information");

        System.out.println("Third Student:");
        s3.display();
    }
}
