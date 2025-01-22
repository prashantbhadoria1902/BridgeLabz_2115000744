import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fee amount:");
        double fee = input.nextDouble();
        System.out.println("Enter the discount percentage:");
        double discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
