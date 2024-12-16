package LibraryManagement;

import java.util.ArrayList;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();
    private static int totalUsers = 0;

    public User() {
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    private String generateUniqueId() {
        totalUsers++;
        return "User-" + totalUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (canBorrowBooks() && book.isAvailable()) {
            borrowedBooks.add(book);
            System.out.println(name + " successfully borrowed " + book.getTitle());
        } else {
            System.out.println(name + " failed to borrow " + book.getTitle());
        }
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
            return true;
        }
        System.out.println(name + " does not have " + book.getTitle() + " to return.");
        return false;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}
