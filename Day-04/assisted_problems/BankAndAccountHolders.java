package assisted_problems;

class Bank{
    public void openAccount(Customer customer){
        System.out.println("Account opened for :" + customer.getName());
    }
}
class Customer{
    private String name;
    private String accountNumber = "121345";
    private double balance;

    
    Customer(String name){
        this.name = name;
    }
        public void viewBalance(){
            System.out.println("Balance:" + balance);
        }
        public void setBalance(double balance){
            this.balance = balance;
        }

    public void displayInfo(){
        System.out.println("Name :" + name + "Account Number:" + accountNumber + "Balance:" + balance);
    }

    public String getName() {
        return name;
    }
}

class BankAndAccountHolders{
    public static void main(String[]args){
        Bank bank = new Bank();

        Customer customer1 = new Customer("Arnav");
        customer1.setBalance(7000000);
        customer1.displayInfo();

        bank.openAccount(customer1);
        customer1.viewBalance();
        
    }
}
