import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter the starting city:");
        String fromCity = input.nextLine();
        System.out.println("Enter the via city:");
        String viaCity = input.nextLine();
        System.out.println("Enter the final city:");
        String toCity = input.nextLine();
        System.out.println("Enter the distance from starting city to via city in miles:");
        double fromToVia = input.nextDouble();
        System.out.println("Enter the distance from via city to final city in miles:");
        double viaToFinalCity = input.nextDouble();
        System.out.println("Enter the total time taken:");
        double timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        System.out.println("The total distance traveled by " + name + " from " + fromCity + " via " + viaCity + " to " + toCity + " is " + totalDistance + " miles, taking " + timeTaken + " hours.");
    }
}
