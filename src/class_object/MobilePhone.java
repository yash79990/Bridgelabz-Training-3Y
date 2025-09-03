package class_object;

import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of phones: ");
        int n = sc.nextInt();
        sc.nextLine();

        MobilePhone[] phones = new MobilePhone[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter model: ");
            String model = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            phones[i] = new MobilePhone(brand, model, price);
        }

        for (MobilePhone phone : phones) {
            phone.displayMobile();
        }
    }
}