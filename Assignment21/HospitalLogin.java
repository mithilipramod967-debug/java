import java.sql.*;
import java.util.Scanner;

public class HospitalLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3307/hospital_db";
        String user = "root";
        String password = "May41123#";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.print("Enter Login ID: ");
            String loginId = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            String sql = "SELECT role FROM staff WHERE login_id=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, loginId);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");

                if (role.equals("Doctor")) {
                    System.out.println("Login successful.");
                    System.out.println("Access granted to Doctor.");
                } else if (role.equals("Nurse")) {
                    System.out.println("Login successful.");
                    System.out.println("Access granted to Nurse.");
                }
            } else {
                System.out.println("Invalid Login ID or Password.");
                System.out.println("Access denied.");
            }

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}