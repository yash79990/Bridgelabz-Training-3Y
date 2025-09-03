package string;

import java.util.Scanner;

public class ToLowercase {
    static String toLowerCaseByCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
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
        String text = sc.nextLine();
        String customLower = toLowerCaseByCharAt(text);
        String builtInLower = text.toLowerCase();
        System.out.println("Custom: " + customLower);
        System.out.println("BuiltIn: " + builtInLower);
        System.out.println("Both same: " + compareByCharAt(customLower, builtInLower));
    }
}