import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class ProjectTasks {
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void userAuthentication() {
        System.out.println("User authentication pending...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeQueries() {
        System.out.println("Database query optimization pending...");
    }
}

public class TodoTest {
    public static void main(String[] args) throws Exception {
        Method[] methods = ProjectTasks.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName() + " | Task: " + annotation.task() + " | Assigned To: " + annotation.assignedTo() + " | Priority: " + annotation.priority());
            }
        }
    }
}
