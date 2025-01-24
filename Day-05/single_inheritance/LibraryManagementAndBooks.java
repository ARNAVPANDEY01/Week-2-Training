package single_inheritance;

class Book{
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear){
        this.publicationYear = publicationYear;
        this.title = title;
    }
    
    public void displayInfo(){
        System.out.println("Title:" + title);
        System.out.println("Publication Year:" + publicationYear);
    }
}

class Author extends Book{
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name:" + name);
        System.out.println("Author Bio:" + bio);
    }
    
}
public class LibraryManagementAndBooks {
    public static void main(String[] args) {
        Author author = new Author("Harry Potter", 1999, "JK Rowling", "Writer");

        author.displayInfo();
        System.out.println();
    }
}
