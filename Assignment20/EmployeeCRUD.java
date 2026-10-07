import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {
    static final String URL = "jdbc:mysql://localhost:3307/companydb";
    static final String USER = "root";
    static final String PASSWORD = "May41123#";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            while (true) {
                System.out.println("\n1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, department);
                    ps.setDouble(4, salary);

                    ps.executeUpdate();
                    System.out.println("Employee added successfully.");
                }

                else if (choice == 2) {
                    String sql = "SELECT * FROM employee";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        System.out.println(
                            rs.getInt("id") + " " +
                            rs.getString("name") + " " +
                            rs.getString("department") + " " +
                            rs.getDouble("salary")
                        );
                    }
                }

                else if (choice == 3) {
                    System.out.print("Enter Employee ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter new salary: ");
                    double salary = sc.nextDouble();

                    String sql = "UPDATE employee SET name=?, department=?, salary=? WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setString(1, name);
                    ps.setString(2, department);
                    ps.setDouble(3, salary);
                    ps.setInt(4, id);

                    ps.executeUpdate();
                    System.out.println("Employee updated successfully.");
                }

                else if (choice == 4) {
                    System.out.print("Enter Employee ID to delete: ");
                    int id = sc.nextInt();

                    String sql = "DELETE FROM employee WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setInt(1, id);
                    ps.executeUpdate();

                    System.out.println("Employee deleted successfully.");
                }

                else if (choice == 5) {
                    break;
                }

                else {
                    System.out.println("Invalid choice.");
                }
            }

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}