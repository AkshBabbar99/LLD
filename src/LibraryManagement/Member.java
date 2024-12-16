package LibraryManagement;

public class Member extends User {
    private static final int MAX_BORROW_LIMIT = 5;

    public Member() {
        super();
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        if (!getBorrowedBooks().isEmpty()) {
            System.out.println("Borrowed Books:");
            for (Book book : getBorrowedBooks()) {
                System.out.println("- " + book.getTitle());
            }
        } else {
            System.out.println("No books borrowed");
        }
    }

    @Override
    public boolean canBorrowBooks() {
        return getBorrowedBooks().size() < MAX_BORROW_LIMIT;
    }
}
