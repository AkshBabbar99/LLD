package LibraryManagement;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Initialize the library system
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Create books
        Book novel1 = new NovelBook("ISBN001", "The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        Book textbook1 = new TextBook("ISBN002", "Mathematics 101", "John Doe", "Mathematics", 2);
        Book novel2 = new NovelBook("ISBN003", "1984", "George Orwell", "Dystopian");
        Book textbook2 = new TextBook("ISBN004", "Physics Basics", "Jane Smith", "Physics", 1);
        Book novel3 = new NovelBook("ISBN005", "To Kill a Mockingbird", "Harper Lee", "Drama");

        // Add books to the library
        library.addBook(novel1);
        library.addBook(textbook1);
        library.addBook(novel2);
        library.addBook(textbook2);
        library.addBook(novel3);

        // Create users
        Member member1 = new Member("Alice", "alice@example.com");
        Member member2 = new Member("Bob", "bob@example.com");
        Member member3 = new Member("Carol", "carol@example.com");
        Librarian librarian = new Librarian("Charlie", "charlie@example.com", "EMP001");

        // Register users
        library.registerUser(member1);
        library.registerUser(member2);
        library.registerUser(member3);
        library.registerUser(librarian);

        // Test borrowing books
        System.out.println("\n--- Borrowing Books ---");
        library.borrowBook(member1, novel1);
        library.borrowBook(member2, novel1);
        library.borrowBook(member2, textbook1);
        library.borrowBook(member1, novel2);
        library.borrowBook(librarian, novel3);
        library.borrowBook(librarian, textbook2);
        library.borrowBook(member3, textbook2);

        // Test borrowing limits for members
        System.out.println("\n--- Testing Borrowing Limit ---");
        ArrayList<Book> testBooks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Book newBook = new NovelBook("ISBN00" + (i + 4), "Book" + (i + 4), "Author" + (i + 4), "Genre" + (i + 4));
            library.addBook(newBook);
            library.borrowBook(member1, newBook);
            testBooks.add(newBook);
        }
        for(Book book : testBooks){
            library.removeBook(book);
        }

        // Test returning books
        System.out.println("\n--- Returning Books ---");
        library.returnBook(member1, novel1);
        library.returnBook(member2, novel1);
        library.returnBook(librarian, novel3);
        library.returnBook(member3, textbook1);
        library.returnBook(member3, textbook2);

        // Librarian borrowing and returning without limit
        System.out.println("\n--- Librarian Borrowing and Returning ---");
        library.borrowBook(librarian, textbook2);
        library.returnBook(librarian, textbook2);

        // Test edge cases
        System.out.println("\n--- Edge Cases ---");
        library.borrowBook(member3, novel2);
        library.borrowBook(member3, textbook2);
        library.borrowBook(member1, novel2);
        library.returnBook(member2, novel2);
        library.borrowBook(member3, novel2);

        // Display final states
        System.out.println("\n--- Final State of Users ---");
        member1.displayDashboard();
        member2.displayDashboard();
        member3.displayDashboard();
        librarian.displayDashboard();

        System.out.println("\n--- Final Library Inventory ---");
        ArrayList<Book> books = library.searchBooks("");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - Available: " + book.isAvailable());
        }
    }
}
