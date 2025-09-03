package method;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrices: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat1 = generateMatrix(r, c);
        int[][] mat2 = generateMatrix(r, c);

        System.out.println("Matrix 1:");
        displayMatrix(mat1);
        System.out.println("Matrix 2:");
        displayMatrix(mat2);

        System.out.println("Addition:");
        displayMatrix(addMatrices(mat1, mat2));
        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(mat1, mat2));

        if (mat1[0].length == mat2.length) {
            System.out.println("Multiplication:");
            displayMatrix(multiplyMatrices(mat1, mat2));
        } else {
            System.out.println("Cannot multiply matrices, incompatible dimensions.");
        }
    }

    public static int[][] generateMatrix(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = (int)(Math.random()*10);
        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, n = b.length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}