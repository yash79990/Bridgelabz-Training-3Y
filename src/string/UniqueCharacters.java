package string;

import java.util.*;

public class UniqueCharacters {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static char[] uniqueChars(String s) {
        int n = findLength(s);
        char[] result = new char[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[idx++] = c;
        }
        return Arrays.copyOf(result, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        char[] uniques = uniqueChars(input);

        System.out.print("Unique characters: ");
        for (char c : uniques) System.out.print(c + " ");
    }
}