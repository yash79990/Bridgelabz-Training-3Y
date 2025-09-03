package method;

import java.util.Arrays;

public class NumberChecker1 {
    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuck(number));
        System.out.println("Is Armstrong: " + isArmstrong(number));
        int[] largest = largestTwo(digits);
        int[] smallest = smallestTwo(digits);
        System.out.println("Largest two: " + Arrays.toString(largest));
        System.out.println("Smallest two: " + Arrays.toString(smallest));
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuck(int num) {
        String s = String.valueOf(num);
        return !s.startsWith("0") && s.contains("0");
    }

    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    public static int[] largestTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max1) { max2 = max1; max1 = x; }
            else if (x > max2) max2 = x;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwo(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < min1) { min2 = min1; min1 = x; }
            else if (x < min2) min2 = x;
        }
        return new int[]{min1, min2};
    }
}
