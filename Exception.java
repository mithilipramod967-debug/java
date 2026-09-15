public class Exception{
    public static void main(String[] args){
        int num1=10;
        int num2=0;
        String s=null;
        try{
            System.out.println("Length of string:"=s.length());
        }catch(ArithmeticException|NullPointException e){
            System.out.println("Error:"+e.getClass(),getSimpleName()+"occured");
        }
    }
}