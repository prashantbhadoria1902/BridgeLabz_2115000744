import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

interface Discountable {
    void applyDiscount(double discount);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public void applyDiscount(double discount) {
        System.out.println("Discount of " + discount + "% applied on " + getItemName());
    }

    public String getDiscountDetails() {
        return "Standard discount available on veg items.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 1.1;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * ADDITIONAL_CHARGE;
    }

    public void applyDiscount(double discount) {
        System.out.println("Discount of " + discount + "% applied on " + getItemName());
    }

    public String getDiscountDetails() {
        return "Additional charges apply to non-veg items.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 350, 1));

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails() + ", Total Price: " + item.calculateTotalPrice());
        }
    }
}
