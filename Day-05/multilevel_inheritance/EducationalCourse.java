package multilevel_inheritance;

// Create Course class
class Course {
    private String courseName;
    private int duration;

    // constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Make a method to display course information
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Create OnlineCourse class
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // constructor
    public OnlineCourse(String courseName, int duration,
            String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override the method display course information
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Create PaidOnlineCourse class
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    // constructor
    public PaidOnlineCourse(String courseName, int duration,
            String platform, boolean isRecorded,
            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Override the method to display course information
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

// Main class where the code executes
public class EducationalCourse {
    public static void main(String[] args) {

        // Create object
        PaidOnlineCourse advancedCourse = new PaidOnlineCourse(
                "Advanced Java",
                40,
                "Udemy",
                true,
                199.99,
                10.0);

        // Call the method from the PaidOnlineCourse class
        advancedCourse.displayCourseInfo();
    }
}
