package string;

import java.util.*;

public class ShortestLongest {
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

    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    static int[] findMinMax(String[][] data) {
        int min = Integer.parseInt(data[0][1]), max = min;
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] result = wordWithLength(words);
        int[] minMax = findMinMax(result);
        System.out.println("Shortest: " + result[minMax[0]][0]);
        System.out.println("Longest: " + result[minMax[1]][0]);
    }
}