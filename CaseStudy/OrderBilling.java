class Order {
    static int totalOrders = 0;
    static double totalRevenue = 0;

    // calculateBill with one parameter
    double calculateBill(double price) {
        double bill = price;
        totalOrders++;
        totalRevenue += bill;
        return bill;
    }

    // calculateBill with two parameters
    double calculateBill(double price, int quantity) {
        double bill = price * quantity;
        totalOrders++;
        totalRevenue += bill;
        return bill;
    }

    // calculateBill with three parameters
    double calculateBill(double price, int quantity, double deliveryCharge) {
        double bill = (price * quantity) + deliveryCharge;
        totalOrders++;
        totalRevenue += bill;
        return bill;
    }

    // Static method
    static void displaySummary() {
        System.out.printf("Total Orders: %d%n", totalOrders);
        System.out.printf("Total Revenue: %.2f%n", totalRevenue);
    }
}

public class OrderBilling {
    public static void main(String[] args) {

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();

        // TC1
        System.out.printf("Bill 1: %.2f%n", order1.calculateBill(500));

        // TC2
        System.out.printf("Bill 2: %.2f%n", order2.calculateBill(250, 3));

        // TC3
        System.out.printf("Bill 3: %.2f%n", order3.calculateBill(250, 3, 50));

        System.out.println();

        // Static data is shared by all objects
        Order.displaySummary();
    }
}