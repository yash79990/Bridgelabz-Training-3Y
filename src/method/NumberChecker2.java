package method;

import java.util.Arrays;

public class NumberChecker2 {
    public static void main(String[] args) {
        int number = 21;
        int[] digits = NumberChecker1.getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum: " + sumDigits(digits));
        System.out.println("Sum squares: " + sumSquares(digits));
        System.out.println("Is Harshad: " + isHarshad(number));
        System.out.println("Digit frequencies:");
        int[][] freq = digitFrequency(digits);
        for (int[] f : freq) System.out.println(f[0] + " -> " + f[1]);
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number) {
        int sum = sumDigits(NumberChecker1.getDigits(number));
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}