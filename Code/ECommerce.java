import java.util.ArrayList;
import java.util.List;

class Customer {
    String name;
    List<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with ID: " + order.id);
    }
}

class Order {
    int id;
    List<Product> products;

    Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayOrder() {
        System.out.println("Order ID: " + id + " contains:");
        for (Product product : products) {
            System.out.println("  - " + product.name);
        }
    }
}

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Customer customer = new Customer("Prashant");
        Order order1 = new Order(101);
        Order order2 = new Order(102);

        Product product1 = new Product("Laptop");
        Product product2 = new Product("Smartphone");
        Product product3 = new Product("Headphones");

        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        order1.displayOrder();
        order2.displayOrder();
    }
}
