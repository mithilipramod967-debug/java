public class MethodOverloadingDemo {

    // Static Variable
    static String college = "SIT Pune";

    // Method Overloading
    void display() {
        System.out.println("Welcome to Java");
    }

    void display(String name) {
        System.out.println("Student Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    // Static Method
    static void showCollege() {
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.display();

        obj.display("Mithili Pramod");

        obj.display("Mithili Pramod", 19);

        showCollege();
    }
}