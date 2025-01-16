//Q-3 Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
//Create a class name HandleBookDetails

class Book{

    //Create attributes by declairing them private
    private String title;
    private String author;
    private int price;


    //Create a constructor by giving values of attributes
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Method to display BookDetails
    void displayInfo(){
        System.out.println("title is:" + title + ", " +  "whose author is:" + author + ", " + "and price is:" + price);
    }
}

public class HandleBookDetails {
    public static void main(String[]args){

        //Create an object of class
        Book book = new Book("John", "JohnElia", 170);

        //Display the result
        book.displayInfo();
    }
}
