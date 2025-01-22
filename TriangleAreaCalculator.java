import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle (in cm):");
        double base = input.nextDouble();
        System.out.println("Enter the height of the triangle (in cm):");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is " + area );
    }
}
