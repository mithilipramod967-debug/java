package Assignment13;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling program in Java.\n");
            writer.write("This data is written into the file.");
            writer.close();
            System.out.println("Data written successfully.");
            // Reading from the file
            FileReader reader = new FileReader("example.txt");
            int ch;
            System.out.println("\nData read from the file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}