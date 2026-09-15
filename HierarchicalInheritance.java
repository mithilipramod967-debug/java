class Animals {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks!");
    }
}

class Cat extends Animals {
    void meow() {
        System.out.println("Cat meows!");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}