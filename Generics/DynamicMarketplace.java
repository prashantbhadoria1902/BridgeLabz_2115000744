class Product<T> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public T getCategory() {
        return category;
    }
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}

class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

public class DynamicMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 700.0, new GadgetCategory());

        book.applyDiscount(10);
        shirt.applyDiscount(5);
        phone.applyDiscount(15);

        System.out.println(book.getName() + " - Discounted Price: " + book.getPrice());
        System.out.println(shirt.getName() + " - Discounted Price: " + shirt.getPrice());
        System.out.println(phone.getName() + " - Discounted Price: " + phone.getPrice());
    }
}
