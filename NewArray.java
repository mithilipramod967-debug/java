import java.util.ArrayList;
import java.util.Vector;
public main ArrayList(){
    public static void main(String[]args){
    int[] numbers={10,20,30,40,50};
    for(int i=0;i<numbers;i++){
        System.out.println(numbers[i]);
    }
    for(int num:numbers){
        System.out.println(num);
    }
    ArrayList<String>fruits=new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    System.out.println("Fruits:"+fruits);
    fruits.remove("Banana");
    System.out.println("After removing Banana:"+fruits);
    System.out.println("Size:"+fruits.size());
    System.out.println("Contains Apple?:"+fruits.contains("Apple"));

    Vector<Integer>numbers1=new Vector<>();
    numbers1.add(100);
    numbers1.add(200);
    numbers1.add(300);
    System.out.println("Vector:"+numbers1);
    numbers.remove(1);
    System.out.println("Vector after removing 1:"+numbers);
    System.out.println("Sixe:"+numbers.size());
    System.out.println("Elements at index 0:"+numbers.get(0));

    public class StringExample{
        public static void main(String[]args){
            String str1="Hello";
            String str2=new String("Java");
            Sytem.out.println(str1);
            Sytem.out.println(str2);
        }
    }

    public class StringBufferExample{
        public static void main(String[]args){
            String Buffer sb=new StringBuffer("Hello");
            sb.append(" World");
            Sytem.out.println("After append:"+sb);
            sb.insert(6,"Java");
        }
    }
    2
    import java.util.StringTokenizerExample{
        public static void main(String[]args){
            String str="Java,Python,C++,JavaScript";
            StringTokenizer st=new StringTokenizer(*str,",");
            while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        }
    }

    }
}