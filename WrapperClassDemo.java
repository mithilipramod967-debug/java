import java.util.Scanner;

public class WrapperClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String str2 = sc.nextLine();

        // Convert String to Integer (Wrapper Class)
        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        // Auto-unboxing
        int a = num1;
        int b = num2;

        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }

        // Autoboxing
        int x = 100;
        Integer wrapperX = x;

        System.out.println("\nPrimitive to Wrapper:");
        System.out.println("Primitive value: " + x);
        System.out.println("Wrapper object: " + wrapperX);

        Integer wrapperY = Integer.valueOf(250);

        // Unboxing
        int y = wrapperY;

        System.out.println("\nWrapper to Primitive:");
        System.out.println("Wrapper object: " + wrapperY);
        System.out.println("Primitive value: " + y);

        sc.close();
    }
}