package bankingsystem;

public class Transaction {
    private final double transactionFee = 5.0;

    public final void performTransaction(Account account, double amount, String type) {
        System.out.println("Performing " + type + " transaction");

        if ("deposit".equalsIgnoreCase(type)) {
            account.deposit(amount);
        } else if ("withdraw".equalsIgnoreCase(type)) {
            account.withdraw(amount + transactionFee);
            System.out.println("Transaction fee of ₹" + transactionFee + " applied");
        } else {
            System.out.println("Invalid transaction type");
        }

        System.out.println("Updated Balance: ₹" + account.getBalance());
    }
}
