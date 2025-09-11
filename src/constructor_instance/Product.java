package constructor_instance;

class Product {
    String productName;
    double price;
    static int totalProducts;

    Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " - " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total: " + totalProducts);
    }

    public static void main(String[] args) {

    }
}