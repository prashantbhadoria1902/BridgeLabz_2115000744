class Employee{
    private static String companyName = "Capgemini";
    private static int totalEmployees=0;
    private String name;
    private final int id;
    private String designation;

    public Employee(int id,String name,String designation){
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employees: "+totalEmployees);
    }

    public void displayDetails(){
        if(this instanceof Employee){
            System.out.println("Company: "+companyName);
            System.out.println("Employee id: "+id);
            System.out.println("Employee Name: "+name);
            System.out.println("Employee Designation: "+designation);
        }
    }

    public static void main(String[] args){
        Employee e1 = new Employee(12,"Prashant","SDE");
        Employee e2 = new Employee(34,"Shivangi","Data Analyst");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }

}