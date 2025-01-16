
//Q-2 Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
//Create a class name StimulateAnAtm
import java.util.*;

class BankAccount {
    Scanner input = new Scanner(System.in);

    // Create Attribute
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Create Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Depositing Money
    public void depositingMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount" + amount);
        } else {
            System.out.println("Invalid Deposited Amount");
        }
    }

    // Withdrawing Money
    public void withdrawingMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal amount exceeds available funds.");
        }
    }

    // Display the result
    void displayDetails() {
        System.out.println("Account Holder name is: " + accountHolder);
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class StimulateAnAtm {
    public static void main(String[] args) {

        // Create an object of BankAccount class
        BankAccount bankaccount = new BankAccount("Arnav", "466101", 300000);

        bankaccount.displayDetails();
        bankaccount.depositingMoney(200000.0);
        bankaccount.withdrawingMoney((140000.0));
        bankaccount.withdrawingMoney(600000.0);

        bankaccount.displayDetails();
    }
}
