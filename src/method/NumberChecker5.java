package method;

public class NumberChecker5 {
    public static void main(String[] args) {
        int number = 28;
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }

    public static int sumProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfect(int n) { return sumProperDivisors(n) == n; }
    public static boolean isAbundant(int n) { return sumProperDivisors(n) > n; }
    public static boolean isDeficient(int n) { return sumProperDivisors(n) < n; }

    public static boolean isStrong(int n) {
        int[] digits = NumberChecker1.getDigits(n);
        int sum = 0;
        for (int d : digits) { int fact = 1; for (int i = 1; i <= d; i++) fact *= i; sum += fact; }
        return sum == n;
    }
}