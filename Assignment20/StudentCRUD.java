import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {
    static final String URL = "jdbc:mysql://localhost:3307/studentdb";
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
                    System.out.print("Enter Roll Number: ");
                    int rollno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setInt(1, rollno);
                    ps.setString(2, name);
                    ps.setString(3, course);
                    ps.setDouble(4, marks);

                    ps.executeUpdate();
                    System.out.println("Student added successfully.");
                }

                else if (choice == 2) {
                    String sql = "SELECT * FROM student";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        System.out.println(
                            rs.getInt("rollno") + " " +
                            rs.getString("name") + " " +
                            rs.getString("course") + " " +
                            rs.getDouble("marks")
                        );
                    }
                }

                else if (choice == 3) {
                    System.out.print("Enter Roll Number to update: ");
                    int rollno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter new marks: ");
                    double marks = sc.nextDouble();

                    String sql = "UPDATE student SET name=?, course=?, marks=? WHERE rollno=?";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setString(1, name);
                    ps.setString(2, course);
                    ps.setDouble(3, marks);
                    ps.setInt(4, rollno);

                    ps.executeUpdate();
                    System.out.println("Student updated successfully.");
                }

                else if (choice == 4) {
                    System.out.print("Enter Roll Number to delete: ");
                    int rollno = sc.nextInt();

                    String sql = "DELETE FROM student WHERE rollno=?";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setInt(1, rollno);
                    ps.executeUpdate();

                    System.out.println("Student deleted successfully.");
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