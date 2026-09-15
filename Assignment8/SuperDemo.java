class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int salary, String department) {
        super(name, salary); // Calls Employee constructor
        this.department = department;
    }

    void displayManagerDetails() {
        super.displayEmployeeDetails(); // Calls Employee method using super
        System.out.println("Department: " + department);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Mithili", 50000, "IT");
        manager.displayManagerDetails();
    }
}