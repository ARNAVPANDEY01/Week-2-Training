//Q-4 Create a MovieTicket class with attributes movieName, seatNumber, and price.
//Create a class name MovieTicketBooking
class Movies {
    // Create Attribute
    private String movieName;
    private int seatNumber;
    private double price;
    private int seatsavailable;

    // Create Constructor
    Movies(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Check condition of seat availability
    public void checkAvailability() {
        if (seatsavailable != 0) {
            seatNumber = seatsavailable;
            seatsavailable--;
        } else {
            System.out.println("Seat is Booked\n");
        }
    }

    // Display the result
    void displayInfo() {
        System.out.println("MovieName is:" + movieName);
        System.out.println("SeatNumber is:" + seatNumber);
        System.out.println("Price is: " + price);
    }

}

public class MovieTicketBooking {
    public static void main(String[] args) {

        // Create an object of Movies class
        Movies movie = new Movies("AntMan", 34, 200);
        movie.displayInfo();

        int seatsavailable = 10;
        movie.checkAvailability();

    }
}
