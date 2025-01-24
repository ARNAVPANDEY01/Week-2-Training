package hybrid_inheritance;

// Create interface refuelable
interface Refuelable {
    void refuel();
}

// Create superclass Vehicle
class Vehicle {
    protected String model;
    protected double maxSpeed;

    // constructor
    public Vehicle(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Create a method to display info
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Create a subclass ElectricVehicle that extends Vehicle superclass
class ElectricVehicle extends Vehicle {
    private double batteryCapacity;

    // constructor
    public ElectricVehicle(String model, double maxSpeed, double batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Create a method to display the charge capacity of vehicle
    public void charge() {
        System.out.println("Charging vehicle with " + batteryCapacity + " kWh battery");
    }
}

// Create a subclass PetrolVehicle that extends Vehicle and that implements the
// Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity;

    // constructor
    public PetrolVehicle(String model, double maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Override the refuel method from the interface
    @Override
    public void refuel() {
        System.out.println("Refueling vehicle with " + fuelTankCapacity + " liter tank");
    }
}

// Main class where the code executes
public class VehicleManagementSystem {
    public static void main(String[] args) {

        // Create an object of Electric Vehicle class
        ElectricVehicle tesla = new ElectricVehicle("Model S", 250, 100);
        // call the methods of the created object
        tesla.displayInfo();
        tesla.charge();

        // Create an object of Petrol Vehicle class
        PetrolVehicle ford = new PetrolVehicle("Mustang", 180, 60);
        // call the methods of the created object
        ford.displayInfo();
        ford.refuel();
    }
}