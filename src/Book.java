public class Book {

    // 'final' is not used here because 'isBorrowed' *must* change.
    private final String title;
    private final String author;
    private final int ISBN;
    private boolean isBorrowed;

    // Only the parameterized constructor is kept
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    // Getters (previously unused methods are now called in LibraryApp)
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

    // Setter
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}