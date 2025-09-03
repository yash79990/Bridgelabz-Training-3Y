package method;

import java.util.Scanner;

public class MatrixInverseDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (2 or 3): ");
        int n = sc.nextInt();
        double[][] mat = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                mat[i][j] = sc.nextDouble();
            }

        System.out.println("Matrix:");
        displayMatrix(mat);

        if (n == 2) {
            double det = determinant2x2(mat);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                displayMatrix(inverse2x2(mat));
            }
        } else if (n == 3) {
            double det = determinant3x3(mat);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                displayMatrix(inverse3x3(mat));
            }
        } else {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
        }
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        return new double[][]{
                { m[1][1]/det, -m[0][1]/det },
                { -m[1][0]/det, m[0][0]/det }
        };
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1])/det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0])/det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0])/det;
        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0])/det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;

        return inv;
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}
