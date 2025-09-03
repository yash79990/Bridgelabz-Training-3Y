package string;

import java.util.*;

public class StudentGrades {
    static char calculateGrade(double marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 50) return 'C';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] marks = new double[5];
        char[] grades = new char[5];

        System.out.println("Enter names and marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i+1) + " name: ");
            names[i] = sc.next();
            System.out.print("Marks of " + names[i] + ": ");
            marks[i] = sc.nextDouble();
            grades[i] = calculateGrade(marks[i]);
        }

        System.out.println("\nName\tMarks\tGrade");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t" + marks[i] + "\t" + grades[i]);
        }
    }
}