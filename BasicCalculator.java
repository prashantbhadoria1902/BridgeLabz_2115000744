import java.util.Scanner;

public class BasicCalculator {
    public static double calculator(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b != 0 ? a / b : Double.NaN;
            default -> Double.NaN;
        };
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Basic Calculator: Enter two numbers and an operation (+, -, *, /)");
        System.out.println("Result: " + calculator(cin.nextDouble(), cin.nextDouble(), cin.next().charAt(0)));
    }
}
