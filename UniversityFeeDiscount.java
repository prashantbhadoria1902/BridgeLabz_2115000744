public class UniversityFeeDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        double discountPercent = 10.0;
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
