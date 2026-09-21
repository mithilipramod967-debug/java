interface Pet{
    void sound();
}
class Bunny implements Pet{
    public void sound(){
        System.out.println("Bunny squeaks!");
    }
}
public class Interface{
    public static void main(String[] args){
        Pet a=new Bunny();
        a.sound();
    }
}