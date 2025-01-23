import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double second = cin.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String op = cin.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
    }
}
