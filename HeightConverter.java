import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in centimeters:");
        double heightInCm = input.nextDouble();
        double heightInInches = heightInCm / 2.54;
        int feet = (int) (heightInInches / 12);
        double inches = heightInInches % 12;
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
