import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal amount:");
        double principal = input.nextDouble();
        System.out.println("Enter the Rate of Interest:");
        double rate = input.nextDouble();
        System.out.println("Enter the Time in years:");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time + " years.");
    }
}
