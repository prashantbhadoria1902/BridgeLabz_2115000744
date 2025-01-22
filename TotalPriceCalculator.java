import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the unit price of the item:");
        double unitPrice = input.nextDouble();
        System.out.println("Enter the quantity of the item:");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
