package objectorientedDesign.Level_2.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Customerop {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customerop(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public List<Product> getProducts() { return products; }

    public void addProduct(Product product) {
        products.add(product);
    }
}
