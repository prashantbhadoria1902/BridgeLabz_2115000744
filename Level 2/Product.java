class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Tablet", 1000.0);
        Product product2 = new Product("Smartphone", 500.0);
        product1.displayProductDetails();
        product2.displayProductDetails();
        Product.displayTotalProducts();
    }
}