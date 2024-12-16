package LibraryManagement;

public class Librarian extends User {
    private final String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Employee Number: " + employeeNumber);
        if(!getBorrowedBooks().isEmpty()) {
            System.out.println("Borrowed Books:");
            for (Book book : getBorrowedBooks()) {
                System.out.println("- " + book.getTitle());
            }
        }else{
            System.out.println("No books borrowed");
        }
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
}
