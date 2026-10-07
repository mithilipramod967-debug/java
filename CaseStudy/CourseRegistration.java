import java.util.*;

class Course {
    String code;
    String name;
    int credits;

    Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public String toString() {
        return code + " - " + name + " (" + credits + " credits)";
    }
}

public class CourseRegistration {
    Vector<Course> availableCourses = new Vector<>();
    ArrayList<Course> registeredCourses = new ArrayList<>();

    void addCourse(Course course) {
        availableCourses.add(course);
        System.out.println("Course added successfully.");
    }

    void searchCourse(String code) {
        for (Course course : availableCourses) {
            if (course.code.equalsIgnoreCase(code)) {
                System.out.println("Course found: " + course);
                return;
            }
        }
        System.out.println("Course not found.");
    }

    void registerCourse(String code) {
        for (Course course : registeredCourses) {
            if (course.code.equalsIgnoreCase(code)) {
                System.out.println("Duplicate registration rejected.");
                return;
            }
        }

        for (Course course : availableCourses) {
            if (course.code.equalsIgnoreCase(code)) {
                registeredCourses.add(course);
                System.out.println("Course registered successfully.");
                return;
            }
        }

        System.out.println("Course not available.");
    }

    void removeCourse(String code) {
        for (Course course : registeredCourses) {
            if (course.code.equalsIgnoreCase(code)) {
                registeredCourses.remove(course);
                System.out.println("Course removed successfully.");
                return;
            }
        }
        System.out.println("Registered course not found.");
    }

    int totalCredits() {
        int total = 0;

        for (Course course : registeredCourses) {
            total += course.credits;
        }

        return total;
    }

    void generateSummary() {
        StringBuffer summary = new StringBuffer();

        summary.append("\n===== Registration Summary =====\n");

        for (Course course : registeredCourses) {
            summary.append(course.code)
                   .append(" - ")
                   .append(course.name)
                   .append(" - ")
                   .append(course.credits)
                   .append(" credits\n");
        }

        summary.append("Total Registered Courses: ")
               .append(registeredCourses.size())
               .append("\n");

        summary.append("Total Credits: ")
               .append(totalCredits())
               .append("\n");

        System.out.println(summary);
    }

    public static void main(String[] args) {
        CourseRegistration cr = new CourseRegistration();

        cr.addCourse(new Course("CS101", "Programming in Java", 4));
        cr.addCourse(new Course("CS102", "Data Structures", 4));
        cr.addCourse(new Course("CS103", "Database Management", 3));
        cr.addCourse(new Course("CS104", "Operating Systems", 4));

        System.out.println("\nAvailable Courses:");
        for (Course course : cr.availableCourses) {
            System.out.println(course);
        }

        System.out.println("\nTC1: Register CS101 and CS102");
        cr.registerCourse("CS101");
        cr.registerCourse("CS102");

        System.out.println("\nTC2: Register CS101 again");
        cr.registerCourse("CS101");

        System.out.println("\nSearching for CS103:");
        cr.searchCourse("CS103");

        System.out.println("\nRemoving CS102:");
        cr.removeCourse("CS102");

        System.out.println("\nRegistering CS102 again:");
        cr.registerCourse("CS102");

        System.out.println("\nTC3: Generate Summary");
        cr.generateSummary();
    }
}