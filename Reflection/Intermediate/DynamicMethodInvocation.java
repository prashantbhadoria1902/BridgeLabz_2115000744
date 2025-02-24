import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = cin.next();
        cin.close();

        MathOperations obj = new MathOperations();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(obj, 10, 5);
        System.out.println("Result: " + result);
    }
}
