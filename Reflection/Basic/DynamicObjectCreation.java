import java.lang.reflect.*;

class Student {
    public Student() {
        System.out.println("Student object created");
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        Student student = constructor.newInstance();
    }
}
