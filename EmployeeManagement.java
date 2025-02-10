abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    protected double getBaseSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(123, "Prashant", 60000);
        PartTimeEmployee e2 = new PartTimeEmployee(124, "Shivangi", 50, 160);

        e1.assignDepartment("HR");
        e2.assignDepartment("IT");

        e1.displayDetails();
        System.out.println(e1.getDepartmentDetails());

        System.out.println();

        e2.displayDetails();
        System.out.println(e2.getDepartmentDetails());
    }
}
