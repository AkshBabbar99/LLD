package LibraryManagement;

import java.util.ArrayList;

public class LibraryManagementSystem {
    private final ArrayList<Book> bookInventory = new ArrayList<>();
    private final ArrayList<User> registeredUsers = new ArrayList<>();

    public void addBook(Book book) {
        bookInventory.add(book);
        System.out.println("Book added to inventory: " + book.getTitle());
    }

    public void removeBook(Book book) {
        bookInventory.remove(book);
        System.out.println("Book removed from inventory: " + book.getTitle());
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public boolean borrowBook(User user, Book book) {
        if (book.isAvailable() && user.canBorrowBooks()) {
            user.borrowBook(book);
            return true;
        }
        System.out.println("Lending failed for book: " + book.getTitle());
        return false;
    }

    public boolean returnBook(User user, Book book) {
        if (user.returnBook(book)) {
            book.returnBook(user);
            return true;
        }
        System.out.println("Book " + book.getTitle() + " is already available in the inventory.");
        return false;
    }

    public ArrayList<Book> searchBooks(String criteria) {
        System.out.println("Searching for books with criteria: " + criteria);
        if(criteria.isEmpty()){
            return bookInventory;
        }
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : bookInventory) {
            if (book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public ArrayList<Book> searchBooks(String criteria, String type) {
        System.out.println("Searching for books with criteria: " + criteria + " and type: " + type);
        if(criteria.isEmpty()){
            return bookInventory;
        }
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : bookInventory) {
            if (type.equals("TextBook") && book.getBookType() == BookType.TEXTBOOK) {
                if (book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria)) {
                    searchResults.add(book);
                }
            } else if (type.equals("NovelBook") && book.getBookType() == BookType.NOVELBOOK) {
                if (book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria)) {
                    searchResults.add(book);
                }
            }
        }
        return searchResults;
    }
}
