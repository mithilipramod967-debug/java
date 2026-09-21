import java.util.Scanner;

public class ExceptionDemo {

    // Method using throws
    static void checkAge(int age) throws Exception {

        if (age < 18) {
            // Using throw
            throw new Exception("Age must be 18 or above.");
        } 
        else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);
        } 
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}