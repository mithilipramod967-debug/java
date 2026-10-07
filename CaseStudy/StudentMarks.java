import java.util.Scanner;

class StudentResult {
    String name;
    int rollNo;
    int mark1, mark2, mark3;

    StudentResult(String name, int rollNo, int mark1, int mark2, int mark3) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    String determineResult() {
        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40)
            return "Pass";
        else
            return "Fail";
    }

    void displayResult() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result: " + determineResult());
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks in Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int mark3 = sc.nextInt();

        StudentResult student = new StudentResult(
            name, rollNo, mark1, mark2, mark3
        );

        student.displayResult();

        sc.close();
    }
}