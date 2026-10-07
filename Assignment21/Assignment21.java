import java.sql.*;

public class Assignment21 {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/jdbc_demo", "root", "May41123#");

        System.out.println("Student database connected successfully.");

        Statement stmt = con.createStatement();

        System.out.println("Statement created successfully.");

        con.close();
    }
}