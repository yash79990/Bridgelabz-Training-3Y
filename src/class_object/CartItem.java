package class_object;

import java.util.Scanner;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int q) {
        quantity += q;
        System.out.println("Added " + q + " items.");
    }

    public void removeItem(int q) {
        if (q > quantity) System.out.println("Not enough items to remove!");
        else {
            quantity -= q;
            System.out.println("Removed " + q + " items.");
        }
    }

    public double totalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
        System.out.print("Enter item quantity: ");
        int qty = sc.nextInt();

        CartItem item = new CartItem(name, price, qty);
        item.displayItem();

        System.out.print("Enter quantity to add: ");
        item.addItem(sc.nextInt());
        System.out.print("Enter quantity to remove: ");
        item.removeItem(sc.nextInt());

        System.out.println("Total cost: " + item.totalCost());
    }
}