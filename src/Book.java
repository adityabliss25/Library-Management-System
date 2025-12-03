public class Book {

    // 1. Private Attributes (Data Hiding - Encapsulation)
    private String title;
    private String author;
    private int ISBN; // International Standard Book Number
    private boolean isBorrowed; // true if borrowed, false otherwise

    // 2. Constructor Overloading: Parameterized Constructor
    // Used to initialize the object with values when it is created.
    public Book(String title, String author, int ISBN) {
        // 'this' keyword refers to the current object's attributes
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false; // Books start as available
    }

    // Optional: Default Constructor (Method Overloading)
    public Book() {
        // Allows creation of a Book object without initial parameters
    }

    // 3. Public Getters (Accessors)
    // Used to safely read the private attributes.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // 4. Public Setter (Mutator)
    // Used to safely change the private attribute. This is the "basic functionality"
    // for borrowing/returning a book.
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}