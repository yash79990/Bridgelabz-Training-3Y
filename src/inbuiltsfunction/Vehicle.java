package inbuiltsfunction;

public class Vehicle {
    private static double registrationFee = 100.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName +
                    ", Type: " + vehicleType +
                    ", RegNo: " + registrationNumber +
                    ", Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150);
        Vehicle v1 = new Vehicle("Honest Raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Prince Danish", "SUV", "XYZ789");

        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}