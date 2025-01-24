package multilevel_inheritance;

// Order superclass
class Order {
    private String orderId;
    private String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Make a method to get order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayInfo(){
        System.out.println("Order Id:" + orderId);
        System.out.println("Order Date:" + orderDate);
    }
}

// ShippedOrder subclass inheriting properties of Order superclass
class ShippedOrder extends Order {
    private String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Override the getOrderStatus method from Order superclass
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tracking Number:" + trackingNumber);
    }
}

// DeliveredOrder subclass inheriting properties of ShippedOrder superclass
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate,
            String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override the getOrderStatus method from ShippedOrder superclass
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Delievery Date:" + deliveryDate);
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create object
        DeliveredOrder deliveredOrder = new DeliveredOrder(
                "ORD123",
                "2024-01-20",
                "TRACK456",
                "2024-01-25");

        // Call the method from the DeliveredOrder class
        // System.out.println("Order Status: " + deliveredOrder.displayInfo());
        System.out.println(deliveredOrder.getOrderStatus());

        // System.out.println("\n-------------------\n");
    }
}