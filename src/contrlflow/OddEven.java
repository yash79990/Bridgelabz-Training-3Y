package contrlflow;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
            }
        } else {
            System.out.println("Please enter a natural number.");
        }
    }
}