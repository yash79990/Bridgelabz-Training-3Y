package array;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Step 2: Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Step 3: Create a String array to store results
        String[] fizzBuzzArray = new String[number + 1];

        // Step 4: Populate the array with FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                fizzBuzzArray[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                fizzBuzzArray[i] = "Buzz";
            } else {
                fizzBuzzArray[i] = String.valueOf(i);
            }
        }

        // Step 5: Display the results
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }
    }
}