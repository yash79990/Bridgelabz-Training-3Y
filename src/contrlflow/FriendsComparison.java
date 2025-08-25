package contrlflow;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age and height of Amar: ");
        int age1 = sc.nextInt();
        double height1 = sc.nextDouble();

        System.out.print("Enter age and height of Akbar: ");
        int age2 = sc.nextInt();
        double height2 = sc.nextDouble();

        System.out.print("Enter age and height of Anthony: ");
        int age3 = sc.nextInt();
        double height3 = sc.nextDouble();

        int youngest = Math.min(age1, Math.min(age2, age3));
        double tallest = Math.max(height1, Math.max(height2, height3));

        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
    }
}