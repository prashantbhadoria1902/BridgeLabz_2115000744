import java.util.ArrayList;
import java.util.List;

class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    void displayDepartments() {
        for (Department department : departments) {
            System.out.println("Department: " + department.name);
            department.displayEmployees();
        }
    }
}

class Department {
    String name;
    List<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("  Employee: " + employee.name);
        }
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        company.addDepartment("IT");
        company.addDepartment("HR");

        company.departments.get(0).addEmployee("Prashant");
        company.departments.get(0).addEmployee("Shivangi");
        company.departments.get(1).addEmployee("Aditi");

        company.displayDepartments();
    }
}