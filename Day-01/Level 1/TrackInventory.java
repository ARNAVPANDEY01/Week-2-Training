//Q-4 Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
//Create a class name TrackInventory

class Items{

    //Create attributes by declairing them private
    private int itemCode;
    private String itemName;
    private int price;

    //Create a constructor by giving values of attributes
    Items(int itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //Method to display MobilePhonesDetails
    void displayItems(){
        System.out.println("ItemCode is: " + itemCode + " ItemName is: " + itemName + " Price is: " + price);
    }


    //Create a variable to store value of total cost
    public double calculateTotalCost(int quantity){
        return price * quantity;
    }
}


public class TrackInventory {
    public static void main(String[]args){

        //Create an object of class
        Items item = new Items(101, "Sugar", 60);

        //Display the result
        item.displayItems();


        //Create a variable to assign value to it
        int quantity = 3;

        double cost = item.calculateTotalCost(quantity);

        //Display the result
        System.out.println("Total Cost for: " + quantity + " is: " + cost);
    }
}
