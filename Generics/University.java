import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String name;
    public CourseType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private T courseType;
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }
    public String getCourseName() {
        return courseName;
    }
    public T getCourseType() {
        return courseType;
    }
}

class University {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getName());
        }
    }
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Mathematics"));
        courses.add(new AssignmentCourse("Software Engineering"));
        courses.add(new ResearchCourse("Artificial Intelligence"));

        displayCourses(courses);
    }
}
