package string;

import java.util.Scanner;

public class Substring {
    static String substringByCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.next();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();
        String subByCharAt = substringByCharAt(text, start, end);
        String subByBuiltIn = text.substring(start, end);
        System.out.println("Substring by charAt: " + subByCharAt);
        System.out.println("Substring by substring: " + subByBuiltIn);
        System.out.println("Both same: " + compareByCharAt(subByCharAt, subByBuiltIn));
    }
}
