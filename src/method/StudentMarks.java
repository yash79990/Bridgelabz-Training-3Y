package method;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculateTotals(marks);

        System.out.println("\nStudent\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\n",
                    i+1, marks[i][0], marks[i][1], marks[i][2],
                    (int)result[i][0], result[i][1], result[i][2]);
        }
    }

    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random()*100);
            marks[i][1] = (int)(Math.random()*100);
            marks[i][2] = (int)(Math.random()*100);
        }
        return marks;
    }

    public static double[][] calculateTotals(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = perc;
        }
        return result;
    }
}