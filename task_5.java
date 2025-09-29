import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    // Constructor
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposited: " + amount);
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrawn: " + amount);
        System.out.println("Withdrawn " + amount + ". New balance: " + balance);
    }

    // Show current balance
    public void showBalance() {
        System.out.println("Account Balance: " + balance);
    }

    // Show transaction history
    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}

// Main class to test Account
public class task_5 {
    public static void main(String[] args) {
        Account myAccount = new Account("123456", "Alice", 1000);

        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.showBalance();
        myAccount.showTransactionHistory();
    }
}
