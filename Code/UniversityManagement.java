import java.util.ArrayList;
import java.util.List;

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
        System.out.println(name + " enrolled in " + course.name);
    }
}

class Professor {
    String name;
    List<Course> courses;

    Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this);
        System.out.println(name + " is assigned to teach " + course.name);
    }
}

class Course {
    String name;
    Professor professor;
    List<Student> students;

    Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student student1 = new Student("Prashant");
        Student student2 = new Student("Shivangi");
        Professor professor = new Professor("Dr. Neeraj");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        professor.assignCourse(course1);
        professor.assignCourse(course2);
    }
}
