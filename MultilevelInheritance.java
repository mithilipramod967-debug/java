class Grandparent{
    void showGrandparent(){
        System.out.println("Grandparent class method");
    }
}
class Parent extends Grandparent{
    void showParent(){
        System.out.println("Parent class method");
    }
}
class Child extends Parent {
    void showChild(){
        System.out.println("Child class method");
    }
}
public class MultilevelInheritance{
    public static void main(String[] args){
        Child c=new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}