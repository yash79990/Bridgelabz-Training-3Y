package string;

import java.util.Scanner;

public class FrequencyNestedLoops {

    public static Object[][] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        Object[][] result = new Object[count][2];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index][0] = chars[i];
                result[index][1] = freq[i];
                index++;
            }
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