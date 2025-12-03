public class LibraryApp {

    public static void main(String[] args) {

        // 1. Create Book Objects (Demonstrating Constructor Use)
        Book book1 = new Book("The Java Programming Guide", "Josh Bloch", 97812345);
        Book book2 = new Book("OOP Fundamentals", "Bjarne Stroustrup", 97867890);

        // 2. Create Member Objects (Demonstrating Constructor Use)
        Member member1 = new Member("Alice Johnson", 101);
        Member member2 = new Member("Bob Smith", 102);

        System.out.println("--- Library System Initial State ---");
        member1.displayMemberInfo();
        System.out.println("Book 1: '" + book1.getTitle() + "' is available? " + !book1.isBorrowed());

        System.out.println("\n--- Simulating Book Borrowing ---");

        // 3. Demonstrate Encapsulation: Borrowing a Book (Using the Setter)
        // Alice borrows the Java Guide. We use the public setter method to change the private state.
        book1.setBorrowed(true);

        System.out.println(member1.getName() + " has borrowed '" + book1.getTitle() + "'.");

        // 4. Demonstrate Encapsulation: Checking the new status (Using the Getter)
        System.out.println("Book 1 Status  " + (book1.isBorrowed() ? "BORROWED" : "AVAILABLE"));

        System.out.println("\n--- Simulating Book Return ---");

        // 5. Simulating a Return
        book1.setBorrowed(false);
        System.out.println(member1.getName() + " has returned '" + book1.getTitle() + "'.");
        System.out.println("Book 1 Status: " + (book1.isBorrowed() ? "BORROWED" : "AVAILABLE"));
    }
}