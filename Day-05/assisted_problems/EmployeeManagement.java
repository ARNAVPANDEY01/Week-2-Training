//Q-2 Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.

package assisted_problems;

//Create a class name Employee
class Employee{
    protected String name;
    protected int age;
    protected int salary;

    //Create a constructor
    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Dsplay the information
    void displayDetails(){
        System.out.println("Name:" + name + " Age:" + age + " Salary:" + salary);
    }
}

//Create a class Manager extends Employee
class Manager extends Employee{
    protected int teamSize;

    //Create a consturctor
    public Manager(String name, int age, int salary, int teamSize){
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    @Override
    //Display the information
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size:" + teamSize);
    }
}

//Create a class Developer extends Employee
class Developer extends Employee{
    protected String programmingLanguage;

    //Create a constructor
    public Developer(String name, int age, int salary, String programmingLanguage){
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    //Display the information
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language:" + programmingLanguage);
    }
}

//Create a class Intern extends Employee
class Intern extends Employee{
    private int duration;
    //Create a constructor
    public Intern(String name, int age, int salary, int duration){
        super(name, age, salary);
        this.duration = duration;
    }

    @Override
    //Display the information
    void displayDetails(){
        super.displayDetails();
        System.out.println("Duration:" + duration);
    }
}



public class EmployeeManagement {
    public static void main(String[] args) {
        
        //Create an object of Manager, Developer, Intern
        Employee emp1 = new Manager("John" , 30, 30000, 40);

        Employee emp2 = new Developer("Robin", 37, 40000, "Java");
        
        Employee emp3 = new Intern("David", 43, 60000, 12);

        //Display the information
        emp1.displayDetails();

        emp2.displayDetails();
        
        emp3.displayDetails();
    }   
}
