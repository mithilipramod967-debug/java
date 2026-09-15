class Student {
    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        // Using Default Constructor
        Student s1 = new Student();

        // Using Parameterized Constructor
        Student s2 = new Student("Mithili", 101);

        System.out.println("Default Constructor");
        s1.display();

        System.out.println("\nParameterized Constructor");
        s2.display();
    }
}