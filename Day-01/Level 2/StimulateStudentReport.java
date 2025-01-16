//Q-1 Create a Student class with attributes name, rollNumber, and marks.
//Create a class name StimulateStudentReport

class Student {

    // Create Attribute
    private String name;
    private int rollNumber;
    private double marks;

    // create constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Check Student Grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Display the results
    void displayReport() {
        System.out.println("Student Name: " + name);
        System.out.println("RollNumber: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade is: " + calculateGrade());
    }
}

public class StimulateStudentReport {
    public static void main(String[] args) {

        //// Create an object of the Student class
        Student student = new Student("Arnav", 103, 90);
        student.displayReport();
    }
}
