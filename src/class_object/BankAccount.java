package class_object;

import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else System.out.println("Amount must be positive");
    }

    public void withdraw(double amount) {
        if (amount > balance) System.out.println("Insufficient balance");
        else if (amount <= 0) System.out.println("Withdrawal must be positive");
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, balance);

        while (true) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                acc.deposit(sc.nextDouble());
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                acc.withdraw(sc.nextDouble());
            } else if (choice == 3) acc.displayBalance();
            else break;
        }
    }
}