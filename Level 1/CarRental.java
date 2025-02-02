class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 50.0;

    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Prashant", "Sedan", 5);
        System.out.println("Total rental cost: " + rental1.calculateTotalCost());
    }
}
