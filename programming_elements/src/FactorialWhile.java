import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1) {
            int fact = 1, i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + fact);
        } else {
            System.out.println("Not a positive integer");
        }
    }
}