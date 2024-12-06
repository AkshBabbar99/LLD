package IntroToOOP;

import java.util.*;

public class BankAccount {
    private String ownerName;
    private double balance;
    private final List<String> transactionLog;

    public BankAccount() {
        this.ownerName = "Test Account";
        this.balance = 100.0;
        this.transactionLog = new ArrayList<>();
    }

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactionLog = new ArrayList<>();
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0.0) {
            this.balance = balance;
        }
    }

    public void printTransactionLog() {
        System.out.println("Transaction Log:");
        for(String transaction : this.transactionLog) {
            System.out.println(transaction);
        }
    }

    public void deposit(double amount) {
        if (amount >= 0.0) {
            this.balance += amount;
            this.transactionLog.add("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            this.transactionLog.add("Withdrawn: $" + amount);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setOwnerName("John Doe");
        account.setBalance(1000.0);
        System.out.println(account.getBalance());
        account.deposit(500.0);
        System.out.println(account.getBalance());
        account.withdraw(200.0);
        System.out.println(account.getBalance());
        account.printTransactionLog();
    }
}