package method;

import java.util.Random;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250 cm
        }
        System.out.println("Heights of players:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean height: " + calculateMean(heights));
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int i : arr) if (i < min) min = i;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        return max;
    }

    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int i : arr) sum += i;
        return sum / arr.length;
    }
}