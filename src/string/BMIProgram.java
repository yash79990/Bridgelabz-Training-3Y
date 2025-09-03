package string;


import java.util.*;

public class BMIProgram {
    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // [weight, height(cm)]

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Person " + (i+1) + " weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 5; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;
            double bmi = weight / (heightM * heightM);
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%.2f\t%s\n", i+1, weight, data[i][1], bmi, getStatus(bmi));
        }
    }
}
