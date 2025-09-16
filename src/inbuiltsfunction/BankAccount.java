package inbuiltsfunction;

public class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Lynda", "ACC101", 1000);
        BankAccount acc2 = new BankAccount("Prince", "ACC102", 500);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}