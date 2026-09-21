import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter marks of Subject 2: ");
        String s2 = sc.nextLine();
        System.out.print("Enter marks of Subject 3: ");
        String s3 = sc.nextLine();
        Integer m1 = Integer.valueOf(s1);
        Integer m2 = Integer.valueOf(s2);
        Integer m3 = Integer.valueOf(s3);
        int total = m1 + m2 + m3;
        System.out.println("\nStudent Marks");
        System.out.println("Subject 1 = " + m1);
        System.out.println("Subject 2 = " + m2);
        System.out.println("Subject 3 = " + m3);
        System.out.println("Total Marks = " + total);
        sc.close();
    }
}