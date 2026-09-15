public class NestedTryExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        String s = null;
        try {
            System.out.println("Outer block try started");
            try {
                System.out.println("Inner block try started");
                int result = num1 / num2;
            } catch (ArithmeticException e) {
                System.out.println("Caught Arithmetic exception in inner try block");
            }
            try {
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException in inner try block");
            }
        } finally {
            System.out.println("Outer block completed.");
        }
        System.out.println("Program continues after exception.");
    }
}