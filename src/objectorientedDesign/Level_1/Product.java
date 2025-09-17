package objectorientedDesign.Level_1;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " $" + p.getPrice());
        }
    }
}

class Customer1 {
    private String name;

    public Customer1(String name) {
        this.name = name;
    }

    public void placeOrder(Order o) {
        System.out.println(name + " placed an order");
        o.showOrder();
    }
}

class EcommerceAggregationDemo {
    public static void main(String[] args) {
        Customer1 c = new Customer1("Ravi");   // ✅ use Customer1
        Order o = new Order();
        o.addProduct(new Product("Laptop", 50000));
        o.addProduct(new Product("Mouse", 800));

        c.placeOrder(o);
    }
}