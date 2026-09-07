class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("General bank account interest");
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account;

        account = new SavingsAccount(10000);
        account.calculateInterest();

        account = new CurrentAccount(10000);
        account.calculateInterest();
    }
}
