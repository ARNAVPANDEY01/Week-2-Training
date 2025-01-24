package hybrid_inheritance;

// Create an interface Worker
interface Worker {
    // empty method without body
    void performDuties();
}

// Create a class Person
class Person {
    protected String name;
    protected String id;

    // constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

// Create a class thats extends Person class and Person class implements Worker
// interface
class Chef extends Person implements Worker {
    private String speciality;

    // constructor
    public Chef(String name, String id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    // Override method from the interface Worker
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking " + speciality + " cuisine");
    }
}

// Create a class thats extends Person class and Person class implements Worker
// interface
class Waiter extends Person implements Worker {
    private String section;

    // constructor
    public Waiter(String name, String id, String section) {
        super(name, id);
        this.section = section;
    }

    // Override method from the interface Worker
    @Override
    public void performDuties() {
        System.out.println(name + " is serving tables in " + section + " section");
    }
}

// Main method where we execute the code
public class RestaurantManagementSystem {
    public static void main(String[] args) {

        // Create object of Chef class
        Chef chef = new Chef("John Doe", "CH001", "Italian");
        // Call method of chef object from Chef class
        chef.performDuties();

        // Create object of Waiter class
        Waiter waiter = new Waiter("Jane Smith", "WT001", "Main Hall");
        // call method of waiter object from Waiter class
        waiter.performDuties();

        System.out.println("\n-------------------\n");
    }
}