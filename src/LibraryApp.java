public class LibraryApp {

    public static void main(String[] args) {

        // 1. Create Book and Member Objects
        Book book1 = new Book("The Java Programming Guide", "Josh Bloch", 97812345);
        Book book2 = new Book("OOP Fundamentals", "Bjarne Stroustrup", 97867890); // Used book2

        Member member1 = new Member("Alice Johnson", 101);
        Member member2 = new Member("Bob Smith", 102); // Used member2

        System.out.println("--- Library System State ---");
        member1.displayMemberInfo();
        member2.displayMemberInfo(); // Used member2

        // Demonstrate previously unused getters for book1
        System.out.println("Book 1 Details: '" + book1.getTitle() + "' by " + book1.getAuthor() + " (ISBN: " + book1.getISBN() + ")");

        System.out.println("\n--- Simulating Book Transactions ---");

        // Alice borrows Book 1
        book1.setBorrowed(true);
        System.out.println(member1.getName() + " has borrowed '" + book1.getTitle() + "'. Status: " + book1.isBorrowed());

        // Bob borrows Book 2 (Using book2 and member2)
        book2.setBorrowed(true);
        System.out.println(member2.getName() + " has borrowed '" + book2.getTitle() + "'. Status: " + book2.isBorrowed());

        // Demonstrate previously unused getter for member ID
        System.out.println("Confirming Member ID: " + member1.getName() + "'s ID is " + member1.getMemberId());

        System.out.println("\n--- Simulating Book Return ---");

        // Alice returns Book 1
        book1.setBorrowed(false);
        System.out.println(member1.getName() + " has returned '" + book1.getTitle() + "'. Status: " + book1.isBorrowed());
    }
}