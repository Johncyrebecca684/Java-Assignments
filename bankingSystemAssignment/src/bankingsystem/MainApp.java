package bankingsystem;

public class MainApp {
    public static void main(String[] args) {
        // Create Bank Accounts
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        // Create Savings Account
        SavingsAccount sa = new SavingsAccount("SA123", 10000);
        sa.printAccountDetails();

        // Create Checking Account
        CheckingAccount ca = new CheckingAccount("CA456", 20000);
        ca.printAccountDetails();

        // Create Transaction Handler
        Transaction transaction = new Transaction();

        // Perform transactions
        transaction.performTransaction(sa, 2000, "deposit");
        transaction.performTransaction(sa, 1500, "withdraw");

        transaction.performTransaction(ca, 5000, "withdraw");

        // Show total accounts
        System.out.println("\nTotal bank accounts created: " + Bank.getTotalAccounts());
    }
}
