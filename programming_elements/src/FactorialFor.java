import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1) {
            int fact = 1;
            for (int i = 1; i <= number; i++)
                fact *= i;
            System.out.println("Factorial of " + number + " is " + fact);
        } else {
            System.out.println("Not a positive integer");
        }
    }
}