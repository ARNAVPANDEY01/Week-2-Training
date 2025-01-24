package hierarchial_inheritance;

// Create BankAccount class
class BankAccount {
    private final String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    // method to fetch balance from account
    public double getBalance() {
        return balance;
    }
}

// Create a SavingsAccount class that extends BankAccount class
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // make a method to applyInterest
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}

// Create a CheckingAccount class that extends BankAccount class
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override the withdraw method from the BankAccount class
    @Override
    public void withdraw(double amount) {
        if (amount <= (getBalance() + overdraftLimit)) {
            super.withdraw(amount);
        }
    }
}

// Create a FixedDepositAccount class that extends BankAccount class
class FixedDepositAccount extends BankAccount {
    private int lockInPeriod;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }
}

// Main method where the code executes
public class BankAccountTypes {
    public static void main(String[] args) {

        // Create object of SavingsAccount class
        SavingsAccount savings = new SavingsAccount("SA001", 1000, 5.5);
        // Call method from SavingsAccount class
        savings.applyInterest();
        System.out.println("Savings Balance: " + savings.getBalance());

        // System.out.println("\n-------------------\n");

    }
}