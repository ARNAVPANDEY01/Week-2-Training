//Q-3 Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
package assisted_problems;

//Create a class name Vehicle their details
class Vehicle{
    protected int maxSpeed;
    protected String fuelType;
    
    //Create a constructor for class variable
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    

    //Create a method to display the information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}


//Class Car extends properties of Vehicle
class Car extends Vehicle{
    protected int seatCapacity;
    
    //Create a constuctor for class variable
    public Car(int maxSpeed, String fuelType, int seatCapacity){

        //Call the constuctor of SuperClass
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    
    @Override
    //Display the details
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Cpaacity:" + seatCapacity);
    }
}


//Class Truck extends properties of Vehicle
class Truck extends Vehicle{
    protected int loadCpaacity;
    
    //Create a constructor
    public Truck(int maxSpeed, String fuelType, int loadCpaacity){
        super(maxSpeed, fuelType);
        this.loadCpaacity = loadCpaacity;
    }

    @Override
    //Display the information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity:" + loadCpaacity);
    }
}


//Class MotorCycle extends properties of Vehicle
class MotorCycle extends Vehicle{
    protected int mileage;

    //Create a consturctor
    public MotorCycle(int maxSpeed, String fuelType, int mileage){
        super(maxSpeed, fuelType);
        this.mileage =  mileage;
    }

    @Override
    //Display the information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Mileage:" + mileage);
    }
}


//Create a main class

public class VehicleAndTransport{
    public static void main(String[] args) {
        
        //Create an object of Car, Truck , MotorCycle
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 20);
        Vehicle motorcycle = new MotorCycle(150, "Petrol", 70);

        //Create an aray of Vehicles
        Vehicle vehicles[] = {car, truck, motorcycle};

        //Display the information
        System.out.println("Vehicle Details:");
        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
