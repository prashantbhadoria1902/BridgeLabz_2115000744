class Patient{
    private static String hospitalName = "Apollo Hospital";
    private static int totalPatients=0;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name,int age,String ailment){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients(){
        System.out.println("Total Patients: "+totalPatients);
    }

    public void displayDetails(){
        System.out.println("Hospital: "+hospitalName);
        System.out.println("Patient's Name: "+name);
        System.out.println("Patient's Age: "+age);
        System.out.println("Patient's Ailment: "+ailment);
    }

    public static void main(String[] args){
        Patient p1 = new Patient("Prashant",23,"Lung Cancer");
        Patient p2 = new Patient("Shivangi",26,"Weakness");
        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}