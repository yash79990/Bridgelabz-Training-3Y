package method;

import java.util.Arrays;

public class NumberChecker3 {
    public static void main(String[] args) {
        int number = 121;
        int[] digits = NumberChecker1.getDigits(number);
        System.out.println("Original: " + Arrays.toString(digits));
        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed: " + Arrays.toString(reversed));
        System.out.println("Is Palindrome: " + Arrays.equals(digits, reversed));
        System.out.println("Is Duck Number: " + NumberChecker1.isDuck(number));
    }

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        return rev;
    }
}