package class_object;

import java.util.Scanner;

public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String clean = text.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) System.out.println(text + " is a palindrome");
        else System.out.println(text + " is not a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check: ");
        String text = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
    }
}