package class_object;

import java.util.Scanner;

public class Items {
    String[] itemCode;
    String[] itemName;
    double[] price;

    Items(String[] itemName, String[] itemCode, double[] price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItems() {
        for (int i = 0; i < itemName.length; i++) {
            System.out.println("Item Code: " + itemCode[i]);
            System.out.println("Item Name: " + itemName[i]);
            System.out.println("Item Price: " + price[i]);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] itemName = new String[n];
        String[] itemCode = new String[n];
        double[] price = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            itemName[i] = sc.nextLine();
            System.out.print("Enter item code: ");
            itemCode[i] = sc.nextLine();
            System.out.print("Enter item price: ");
            price[i] = sc.nextDouble();
            sc.nextLine(); // consume newline
        }

        Items items = new Items(itemName, itemCode, price);
        items.displayItems();
    }
}