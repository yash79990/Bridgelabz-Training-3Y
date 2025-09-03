package method;

import java.util.Scanner;

public class UnitConverter1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Km to Miles");
        System.out.println("2. Miles to Km");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1 -> System.out.println(value + " Km = " + convertKmToMiles(value) + " Miles");
            case 2 -> System.out.println(value + " Miles = " + convertMilesToKm(value) + " Km");
            case 3 -> System.out.println(value + " Meters = " + convertMetersToFeet(value) + " Feet");
            case 4 -> System.out.println(value + " Feet = " + convertFeetToMeters(value) + " Meters");
            default -> System.out.println("Invalid choice");
        }
    }
}