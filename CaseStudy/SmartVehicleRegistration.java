class Vehicles {
    String registrationNumber;
    String ownerName;
    String model;
    int manufacturingYear;

    // Default constructor
    Vehicles() {
        registrationNumber = "Not Assigned";
        ownerName = "Unknown";
        model = "Unknown";
        manufacturingYear = 0;
    }

    // Parameterized constructor
    Vehicles(String registrationNumber, String ownerName, String model, int manufacturingYear) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    // Copy constructor
    Vehicles(Vehicles v) {
        this.registrationNumber = v.registrationNumber;
        this.ownerName = v.ownerName;
        this.model = v.model;
        this.manufacturingYear = v.manufacturingYear;
    }

    // Calculate vehicle age
    int calculateVehicleAge(int currentYear) {
        return currentYear - manufacturingYear;
    }

    void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Model: " + model);
        System.out.println("Manufacturing Year: " + manufacturingYear);
    }
}

public class SmartVehicleRegistration {
    public static void main(String[] args) {

        // TC1: Default constructor
        Vehicles v1 = new Vehicles();

        System.out.println("Default Vehicle:");
        v1.display();
        System.out.println();

        // TC2: Parameterized constructor
        Vehicles v2 = new Vehicles("OD02AB1234", "Mithili", "Swift", 2023);

        System.out.println("Parameterized Vehicle:");
        v2.display();
        System.out.println("Vehicle Age: " + v2.calculateVehicleAge(2026));
        System.out.println();

        // TC3: Copy constructor
        Vehicles v3 = new Vehicles(v2);

        System.out.println("Copied Vehicle:");
        v3.display();
        System.out.println("Vehicle Age: " + v3.calculateVehicleAge(2026));
    }
}