class Student
{
    // Variables
    int rollNo;
    String name;
    double marks;

    // Default Constructor
    Student()
    {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
    }

    // Parameterized Constructor
    Student(int r, String n, double m)
    {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Copy Constructor
    Student(Student s)
    {
        rollNo = s.rollNo;
        name = s.name;
        marks = s.marks;
    }

    // Method to display details
    void display()
    {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
    }

    // Method to calculate grade
    void grade()
    {
        if(marks >= 90)
            System.out.println("Grade : A");
        else if(marks >= 75)
            System.out.println("Grade : B");
        else if(marks >= 60)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : D");
    }
}

public class JavaEnvironmentDemo
{
    public static void main(String args[])
    {
        // Object using Default Constructor
        Student s1 = new Student();

        System.out.println("Default Constructor");
        s1.display();
        s1.grade();

        System.out.println();

        // Object using Parameterized Constructor
        Student s2 = new Student(101, "Mithili", 88.5);

        System.out.println("Parameterized Constructor");
        s2.display();
        s2.grade();

        System.out.println();

        // Object using Copy Constructor
        Student s3 = new Student(s2);

        System.out.println("Copy Constructor");
        s3.display();
        s3.grade();
    }
}