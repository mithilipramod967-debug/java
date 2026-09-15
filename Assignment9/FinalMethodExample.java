class Parent {
    final void display() {
        System.out.println("Parent Class final Method");
    }
}

class Child extends Parent {
    // Cannot override final method
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}