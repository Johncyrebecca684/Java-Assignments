package bankingsystem;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
