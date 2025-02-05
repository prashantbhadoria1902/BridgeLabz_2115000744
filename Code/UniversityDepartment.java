import java.util.ArrayList;
import java.util.List;

class University {
    String name;
    List<Department> departments;
    List<Faculty> facultyMembers;

    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    void displayUniversityDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println("  " + department.name);
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("  " + faculty.name);
        }
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

public class UniversityDepartment {
    public static void main(String[] args) {
        University university = new University("GLA University");
        university.addDepartment("Computer Science");
        university.addDepartment("Physics");

        Faculty faculty1 = new Faculty("Dr. RajKumar");
        Faculty faculty2 = new Faculty("Dr. Ajitesh");

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        university.displayUniversityDetails();
    }
}
