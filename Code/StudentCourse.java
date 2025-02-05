import java.util.ArrayList;
import java.util.List;

class School {
    String name;
    List<Student> students;

    School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("  " + course.name);
        }
    }
}

class Course {
    String name;
    List<Student> students;

    Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void viewStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println("  " + student.name);
        }
    }
}

public class StudentCourse {
    public static void main(String[] args) {
        School school = new School("Mount Litera Zee School");
        Student student1 = new Student("Prashant");
        Student student2 = new Student("Shivangi");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        school.addStudent(student1);
        school.addStudent(student2);

        student1.viewCourses();
        student2.viewCourses();
        course1.viewStudents();
        course2.viewStudents();
    }
}
