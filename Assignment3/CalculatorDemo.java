class Calculator {

    static int calculationCount = 0;

    // Addition of integers
    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    // Addition of decimals
    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    static void displayCount() {
        System.out.println("Total Calculations: " + calculationCount);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Integer Addition: " + c.add(10, 20));
        System.out.println("Decimal Addition: " + c.add(10.5, 20.8));

        Calculator.displayCount();
    }
}