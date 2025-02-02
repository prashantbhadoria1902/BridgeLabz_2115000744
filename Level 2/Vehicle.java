class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 150.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Prashant", "Car");
        Vehicle vehicle2 = new Vehicle("Shivangi", "Motorcycle");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(200.0);
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
