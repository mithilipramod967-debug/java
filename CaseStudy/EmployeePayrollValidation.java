class EmployeePayroll {
    Integer employeeId;
    Double salary;
    Double bonus;
    Integer workingDays;

    EmployeePayroll(String employeeId, String salary, String bonus, String workingDays) {
        this.employeeId = Integer.valueOf(employeeId);
        this.salary = Double.valueOf(salary);
        this.bonus = Double.valueOf(bonus);
        this.workingDays = Integer.valueOf(workingDays);
    }

    double calculateGrossSalary() {
        return salary + bonus;
    }

    double calculateAnnualSalary() {
        return calculateGrossSalary() * 12;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

public class EmployeePayrollValidation {
    public static void main(String[] args) {
        try {
            String employeeId = "101";
            String salary = "50000.50";
            String bonus = "5000.00";
            String workingDays = "26";

            EmployeePayroll employee =
                new EmployeePayroll(employeeId, salary, bonus, workingDays);

            employee.display();

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
    }
}