//Q-2 Create a Book class to manage library books with the following features:
// Static:
// A static variable libraryName shared across all books.
// A static method displayLibraryName() to print the library name.
// This:
// Use this to initialize title, author, and isbn in the constructor.
// Final:
// Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
// Instanceof:
// Verify if an object is an instance of the Book class before displaying its details.
class Book{
    private static String libraryName = "Central Library";
    private String title;
    private String author;
    private final String isbn;

    Book(String title,String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName(){
        System.out.println("LibraryName is:" + libraryName);
    }

    public void displayInfo(){
        if(this instanceof Book){
            System.out.println("Title:"+ title);

            System.out.println("Author:" + author);

            System.out.println("ISBN:" + isbn);
        }else{
            System.out.println("Invalid Book");
        }
    }
}
public class LibraryManagementSystem{
    public static void main(String[]args){

        Book.displayLibraryName();
        System.out.println();

        Book book1 = new Book("ThunderLight", "ames Henry", "123432");

        Book book2 = new Book("Harry Potter", "JK Rowling", "#12321");

        book1.displayInfo();
        System.out.println();
        
        book2.displayInfo();
    }
}


