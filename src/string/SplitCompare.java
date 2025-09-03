package string;

import java.util.*;

public class SplitCompare {
    static String[] customSplit(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int start = 0, index = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                words[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] builtIn = input.split(" ");
        String[] custom = customSplit(input);
        System.out.println("Equal? " + compare(custom, builtIn));
    }
}