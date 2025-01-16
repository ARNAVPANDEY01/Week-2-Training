//Q-5 Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone.
//Create a class name HandleMobilePhones
class MobilePhones{

    //Create attributes by declairing them private
    private String brand;
    private String model;
    private int price;


    //Create a constructor by giving values of attributes
    MobilePhones(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    //Method to display MobilePhonesDetails
    void displayDetails(){
        System.out.println("Brand is: " + brand + " whose model is: " + model + " and price is: " + price);
    }
}

public class HandleMobilePhones {
    public static void main(String[]args){

        //Create an object of class
        MobilePhones mobilephone = new MobilePhones("Apple", "Iphone13", 40000);

        //Display the result
        mobilephone.displayDetails();
    }
}

