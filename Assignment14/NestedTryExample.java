public class NestedTryExample {

    static int getNumber() {
        return 0;
    }

    static String getString() {
        return null;
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = getNumber();

        try {

            System.out.println("Outer block try started");

            try {

                System.out.println("Inner block try started");

                int result = num1 / num2;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {

                System.out.println("Caught Arithmetic exception in inner try block");

            }

            try {

                String s = getString();
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