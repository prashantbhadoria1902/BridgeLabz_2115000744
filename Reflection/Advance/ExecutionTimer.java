import java.lang.reflect.*;

class Task {
    public void perform() {
        for (int i = 0; i < 1_000_000; i++);
    }
}

public class ExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) throws Exception {
        Task task = new Task();
        measureExecutionTime(task, "perform");
    }
}
