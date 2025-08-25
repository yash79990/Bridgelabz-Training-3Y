package contrlflow;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        int i = 100;
        while (i >= 1) {
            if (i % number == 0)
                System.out.println(i);
            i--;
        }
    }
}