public class TryCatchExample{
    public static void main(String[] args){
        int num1=10;
        int num2=0;
        try{
            int result=num1/num2;
            System.out.println("Result:"+result);
        }catch(ArithmeticException e){
            System.out.println("Error cannot divide by zero");
            System.out.println("Exception message:"+e.getMessage());
        }
    }
}