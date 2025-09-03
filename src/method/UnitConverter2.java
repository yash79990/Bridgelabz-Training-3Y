package method;

import java.util.Scanner;

public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Cm");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1 -> System.out.println(value + " Yards = " + convertYardsToFeet(value) + " Feet");
            case 2 -> System.out.println(value + " Feet = " + convertFeetToYards(value) + " Yards");
            case 3 -> System.out.println(value + " Meters = " + convertMetersToInches(value) + " Inches");
            case 4 -> System.out.println(value + " Inches = " + convertInchesToMeters(value) + " Meters");
            case 5 -> System.out.println(value + " Inches = " + convertInchesToCm(value) + " Cm");
            default -> System.out.println("Invalid choice");
        }
    }
}