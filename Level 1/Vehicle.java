class Vehicle{
    private static double registrationFee = 2500.00;
    private String ownerName;
    private String vehicleType;
    private int registrationNo;

    public Vehicle(int registrationNo,String ownerName,String vehicleType){
        this.registrationNo = registrationNo;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newRegistrationFee){
        registrationFee = newRegistrationFee;
        System.out.println("New Registration Fees: "+registrationFee);
    }

    public void displayDetails(){
        System.out.println("Registration Fees: "+registrationFee);
        System.out.println("Registration Number: "+registrationNo);
        System.out.println("Owner's Name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
    }

    public static void main(String[] args){
        Vehicle v1 = new Vehicle(1234,"Prashant","Car");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(3000.00);
    }
}