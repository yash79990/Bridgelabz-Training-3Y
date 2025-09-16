package inheritance;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accNo, double balance, double withdrawalLimit) {
        super(accNo, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int termYears;

    FixedDepositAccount(int accNo, double balance, int termYears) {
        super(accNo, balance);
        this.termYears = termYears;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account - Term: " + termYears + " years");
    }

    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount(1001, 5000, 5.5),
                new CheckingAccount(1002, 2000, 1000),
                new FixedDepositAccount(1003, 10000, 3)
        };

        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) ((SavingsAccount) acc).displayAccountType();
            else if (acc instanceof CheckingAccount) ((CheckingAccount) acc).displayAccountType();
            else if (acc instanceof FixedDepositAccount) ((FixedDepositAccount) acc).displayAccountType();
        }
    }
}