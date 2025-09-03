package method;

import java.util.Random;

public class RandomNumbers {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + rand.nextInt(9000); // ensures 4-digit
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average = " + results[0]);
        System.out.println("Min = " + (int) results[1]);
        System.out.println("Max = " + (int) results[2]);
    }
}
