import java.util.ArrayList;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Mithili Pramod");
        students.add("Aditi");
        students.add("Sneha");

        System.out.println("ArrayList:");
        System.out.println(students);

        // Vector
        Vector<Integer> marks = new Vector<>();

        marks.add(85);
        marks.add(90);
        marks.add(95);

        System.out.println("\nVector:");
        System.out.println(marks);

        // StringBuffer
        StringBuffer sb = new StringBuffer("Mithili");

        sb.append(" - CSE Student");

        System.out.println("\nStringBuffer:");
        System.out.println(sb);
    }
}