//Q-2 Write a program to create a Circle class with an attribute radius.
//Create a class name AreaOfCircle
class Circle{

    //Create attribute by declairing them private
    private double radius;

    //Create a constructor by giving value of attribute
    Circle(double radius){
        this.radius = radius;
    }

    //Create a method to calculateAreaOfCircle
    public double calculateAreaOfCircle(){
        return Math.PI * radius * radius;
    }

    //Create a method to calculateCircumference
    public double calculateCircumference(){
        return 2 * Math.PI * radius; 
    }


     //Method to display AreaOfCircle
    void displayArea(){
        System.out.println("Radius" + radius);
        System.out.println("Area of circle:"+ calculateAreaOfCircle());
        System.out.println("CircumferenceOfCircle:" + calculateCircumference());
    }
} 


public class AreaOfCircle {
    public static void main(String[]args){

        //Create an object of class
        Circle circle = new Circle(5.0);

        //Display the result
        circle.displayArea();
    }
}
