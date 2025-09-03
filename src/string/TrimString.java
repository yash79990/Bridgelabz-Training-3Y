package string;

import java.util.*;

public class TrimString {
    static String customTrim(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        String result = "";
        for (int i = start; i <= end; i++) result += s.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading/trailing spaces:");
        String input = sc.nextLine();
        String trimmed = customTrim(input);
        System.out.println("Custom Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + input.trim() + "'");
    }
}
