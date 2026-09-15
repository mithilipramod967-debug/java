import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FH{
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("data.txt");
            writer.write("Welcome to Java File Handling");
            writer.write("This is an example of writing and reading a file");
            writer.close();
            FileReader reader=new FileReader("data.txt");
            int ch;
            System.out.println("Contents of the file");
            while((ch=reader.read())!=-1){
                System.out.println((char)ch);
            }
            reader.close();
        }
        catch{
            System.out.println("An error occurred"+e.getMessage());
        }
    }
}