//Q-1  Create a BankAccount class with the following features:
// Static:
// A static variable bankName shared across all accounts.
// A static method getTotalAccounts() to display the total number of accounts.

// This:
// Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.

// Final:
// Use a final variable accountNumber to ensure it cannot be changed once assigned.
// Instanceof:
// Check if an account object is an instance of the BankAccount class before displaying its details.

//Create a class BankAccount
class BankAccount{

    //Create a varibale bankName to store bank Name
    private static String bankName = "SBI";

    //Create a variable totalaccount to count the total number of accounts
    private static int TotalAccounts = 0;

    //Create a variable accountHodlerName to store the account holder name
    private String accountHodlerName;

    //Create a variable aaccounNumber to store the account number
    private final String accountNumber;


    //Create a constructor to inititalize the accounnumber and accountHolderName and increment the total account by this constructor
    public BankAccount(String accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHodlerName = accountHolderName;
        TotalAccounts++;
    }

    //Create a static method to get the total number of accounts
    static int getTotalAccounts(){
        return TotalAccounts;
    }


    //Creaate a method to display the information of the accout
    public void displayInfo(){

        //Check if the object is an instance of BankAccount
        if( this instanceof BankAccount){
            System.out.println("Bank Name:" + bankName);
            System.out.println("Account Holder Name:" + accountHodlerName);

            System.out.println("Account Number:" + accountNumber);
        }
    }
}

//Create a class BankAccountSystem
public class BankAccountSystem{
    public static void main(String[]args){

        ///Create object of account 1
        BankAccount account1 = new BankAccount("1001", "Arnav");

        //Create object of account 2
        BankAccount account2 = new BankAccount("1002", "Neha");

        //Display the result
        account1.displayInfo();
        System.out.println();

        account2.displayInfo();

        System.out.println();

        //Display the total number of accounts
        System.out.println("Total Accounts:" + BankAccount.getTotalAccounts());

    }
}