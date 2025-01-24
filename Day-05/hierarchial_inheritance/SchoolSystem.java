package hierarchial_inheritance;

// Create Person superclass
class Person {
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Create method to display basic information
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Create a Teacher class that extends Person class
class Teacher extends Person {
    private String subject;

    // constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Create method to display teacher information
    public void displayTeacherInfo() {
        displayBasicInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Create a Student class that extends Person class
class Student extends Person {
    private int grade;

    // constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Create method to display student information
    public void displayStudentInfo() {
        displayBasicInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Create a Staff class that extends Person class
class Staff extends Person {
    private String department;

    // constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Create method to display staff information
    public void displayStaffInfo() {
        displayBasicInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main method where the code executes
public class SchoolSystem {
    public static void main(String[] args) {

        // Create object of Teacher class
        Teacher mathTeacher = new Teacher("John Smith", 35, "Mathematics");
        // Call method from Teacher class
        mathTeacher.displayTeacherInfo();

        // Create object of Student class
        Student studentAlex = new Student("Alex Brown", 16, 11);
        // Call method from Student class
        studentAlex.displayStudentInfo();
    }
}