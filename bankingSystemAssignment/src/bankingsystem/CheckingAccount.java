package bankingsystem;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Checking Account");
        } else {
            System.out.println("Insufficient balance in Checking Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
