package string;

import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students (one by one):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (ages[i] < 0)
                System.out.println("Student " + (i+1) + ": Invalid Age");
            else if (ages[i] >= 18)
                System.out.println("Student " + (i+1) + ": Eligible to Vote");
            else
                System.out.println("Student " + (i+1) + ": Not Eligible to Vote");
        }
    }
}