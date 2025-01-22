import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangular park in meters:");
        double side1 = input.nextDouble();
        System.out.println("Enter the length of the second side of the triangular park in meters:");
        double side2 = input.nextDouble();
        System.out.println("Enter the length of the third side of the triangular park in meters:");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3; // in meters
        double distanceToRun = 5000; // 5 km = 5000 meters
        double rounds = distanceToRun / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
    }
}
