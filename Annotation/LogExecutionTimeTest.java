import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class PerformanceTest {
    @LogExecutionTime
    public void taskOne() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++); 
        long end = System.nanoTime();
        System.out.println("taskOne execution time: " + (end - start) + " ns");
    }

    @LogExecutionTime
    public void taskTwo() {
        long start = System.nanoTime();
        for (int i = 0; i < 5000000; i++); 
        long end = System.nanoTime();
        System.out.println("taskTwo execution time: " + (end - start) + " ns");
    }
}

public class LogExecutionTimeTest {
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();
        Method[] methods = PerformanceTest.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                method.invoke(test);
            }
        }
    }
}
