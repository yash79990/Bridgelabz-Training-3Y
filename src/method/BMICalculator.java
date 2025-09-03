package method;

import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 4  ; i++) {
            System.out.print("Enter weight of member " + (i + 1) + " (kg): ");
            members[i][0] = sc.nextDouble();
            System.out.print("Enter height of member " + (i + 1) + " (cm): ");
            members[i][1] = sc.nextDouble();

            members[i][2] = calculateBMI(members[i][0], members[i][1]);
            statuses[i] = getBMIStatus(members[i][2]);
        }

        System.out.println("\nResults:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Member %d -> Weight: %.1f kg, Height: %.1f cm, BMI: %.2f, Status: %s%n",
                    (i + 1), members[i][0], members[i][1], members[i][2], statuses[i]);
        }
    }
}