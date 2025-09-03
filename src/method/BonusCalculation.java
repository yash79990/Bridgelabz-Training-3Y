package method;

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] salaryYears = new double[10][2];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaryYears[i][0] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            salaryYears[i][1] = sc.nextDouble();
        }

        double[][] newSalaryBonus = calculateBonus(salaryYears);
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("\nEmployee\tOld Salary\tBonus\tNew Salary");
        for (int i = 0; i < 3; i++) {
            totalOld += salaryYears[i][0];
            totalNew += newSalaryBonus[i][1];
            totalBonus += newSalaryBonus[i][0];
            System.out.printf("%d\t\t%.2f\t\t%.2f\t%.2f\n", i+1, salaryYears[i][0], newSalaryBonus[i][0], newSalaryBonus[i][1]);
        }

        System.out.printf("\nTotal Old Salary: %.2f\nTotal Bonus: %.2f\nTotal New Salary: %.2f\n", totalOld, totalBonus, totalNew);
    }

    public static double[][] calculateBonus(double[][] salaryYears) {
        double[][] newSalary = new double[10][2];
        for (int i = 0; i < 3; i++) {
            double bonus = (salaryYears[i][1] > 5) ? salaryYears[i][0] * 0.05 : salaryYears[i][0] * 0.02;
            newSalary[i][0] = bonus;
            newSalary[i][1] = salaryYears[i][0] + bonus;
        }
        return newSalary;
    }
}
