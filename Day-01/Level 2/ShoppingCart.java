//Q-5 Create a CartItem class with attributes itemName, price, and quantity.
//Create a class name  ShoppingCart
class CartItem {

    // create attributes
    String itemName;
    int price;
    int quantity;

    // create constructor
    CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // add an item to the cart
    void addItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // remove an item from the cart
    void removeItem() {
        this.itemName = null;
        this.price = 0;
        this.quantity = 0;
    }

    // display the total cost
    void displayTotalCost() {
        System.out.println("Total Cost: " + price * quantity);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Create an object of the CartItem class
        CartItem item = new CartItem("Laptop", 50000, 2);
        item.displayTotalCost();
        item.removeItem();
        item.displayTotalCost();
    }
}
