// Design an Employee class with the following features:
// Static:
// A static variable companyName shared by all employees.
// A static method displayTotalEmployees() to show the total number of employees.
// This:
// Use this to initialize name, id, and designation in the constructor.
// Final:
// Use a final variable id for the employee ID, which cannot be modified after assignment.
// Instanceof:
// Check if a given object is an instance of the Employee class before printing the employee details.


class Employee{
    private static String companyName = "Capgemini";
	private static int totalEmployees = 0;
	
	private String name;
	private final String id;
	private String designation;
	
	Employee(String name, String id, String designtion){
	    this.name=name;
		this.id= id;
		this.designation = designation;
		totalEmployees++;
	}
	
	static void displayTotalEmployee(){
	    System.out.println("Total Employees: " + totalEmployees);
	}
	
	void display(){
	    if(this instanceof Employee){
		    System.out.println("Employee Name: "+ name);
			System.out.println("Employee id: "+ id);
			System.out.println("Designation: "+ designation);
		}
		
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args){
	    Employee employee1= new Employee("Arnav Pandey", "10023", "Banglore");
		employee1.display();
		
		Employee employee2= new Employee("Adarsh Biswas", "10345", "Hyderabad");
		employee2.display();
		
		Employee.displayTotalEmployee();
	}
}

	    
	