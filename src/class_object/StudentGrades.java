package class_object;

import java.util.Scanner;

public class StudentGrades {
    String name;
    String rollNumber;
    double[] marks;

    StudentGrades(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        double totalMarks = calculateAverageMarks();
        if (totalMarks >= 80) return "Grade A";
        else if (totalMarks >= 60) return "Grade B";
        else if (totalMarks >= 50) return "Grade C";
        else if (totalMarks >= 40) return "Grade D";
        else return "Grade F";
    }

    public double calculateAverageMarks() {
        double sum = 0;
        for (double m : marks) sum += m;
        return sum / marks.length;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
        System.out.println(calculateGrade());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        StudentGrades[] students = new StudentGrades[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            String roll = sc.nextLine();
            double[] marks = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter mark " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }
            sc.nextLine();
            students[i] = new StudentGrades(name, roll, marks);
        }

        for (StudentGrades student : students) student.displayStudent();
    }
}