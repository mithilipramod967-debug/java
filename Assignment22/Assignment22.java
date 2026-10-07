import java.sql.*;

public class Assignment22 {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/jdbc_demo", "root", "May41123#");

        String username = "admin";
        String password = "1234";

        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM login WHERE username = ? AND password = ?");

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }

        con.close();
    }
}