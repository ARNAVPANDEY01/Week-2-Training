class Product{
    private static double discount = 10;
    private String productName;
    private int price;
    private int quantity;
    private final String id;

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        } else {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
    }

    Product(String productName, int price, int quantity, String id){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }
    public void displayInfo(){
        if(this instanceof Product){
            System.out.println("Product Name:" + productName);
            System.out.println("Product Price:" + price);
            System.out.println("Product Quantity:" + quantity);
            System.out.println("Product ID:" + id);
        }else{
            System.out.println("Not instance of product");
        }
    }

}


public class ShoppingCartSystem{
    public static void main(String[]args){
        Product product1 = new Product("Sugar", 30, 3, "#121");

        Product product2 = new Product("Salt", 27, 2, "#1111");

        product1.displayInfo();
        System.out.println();

        product2.displayInfo();
    } 
}
