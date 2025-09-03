package string;

import java.util.Scanner;

public class FrequencyUnique {

    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = ch;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }

    public static Object[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(text);
        Object[][] result = new Object[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = unique[i];
            result[i][1] = freq[unique[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        Object[][] frequency = findFrequency(text);
        System.out.println("\nCharacter   Frequency");
        for (Object[] row : frequency) {
            System.out.println(row[0] + "           " + row[1]);
        }
    }
}