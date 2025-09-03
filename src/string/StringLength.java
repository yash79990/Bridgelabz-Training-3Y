package string;

import java.util.Scanner;

public class StringLength {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.next();
        System.out.println("Length without length(): " + findLength(input));
        System.out.println("Length with length(): " + input.length());
    }
}