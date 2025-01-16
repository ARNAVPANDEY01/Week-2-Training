//Q-1 Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
//Create a class name EmployeeDetals

class Employee {

    //Create attributes by declairing them private
    private String name;
    private int id;
    private double salary;

    //Create a constructor by giving values of attributes
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", Id: " + id + ", Salary: " + salary);
    }
}

public class EmployeeDetals {
    public static void main(String[] args) {

        //Create an object of class
        Employee employees = new Employee("Alice", 101, 30000);

        //Display the result
        employees.displayDetails();
    }
}
