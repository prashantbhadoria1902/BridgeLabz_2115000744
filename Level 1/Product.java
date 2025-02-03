class Product{
    private static double discount = 10.0;
    private String productName;
    private double price;
    private int quantity;
    private final int productId;

    public Product(int productId,String productName,double price,int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount){
        discount = newDiscount;
        System.out.println("New Discount on products: "+discount+" %");
    }

    public void displayDetails(){
        System.out.println("Product Id: "+productId);
        System.out.println("Product Name: "+productName);
        System.out.println("Product Price: "+price);
        System.out.println("Product Quantity: "+quantity);
        System.out.println("Discount: "+discount+" %");
    }

    public static void main(String[] args){
        Product p1 = new Product(12,"YogaBar Muesli",495.0,2);
        p1.displayDetails();
        Product.updateDiscount(12.22);
    }
}