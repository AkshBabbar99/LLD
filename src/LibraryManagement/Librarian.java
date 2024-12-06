package LibraryManagement;

public class Librarian extends User {
    private final String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber){
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public void addBook(Book book){
        //add books
    }

    public void removeBook(Book book){
        //remove books
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
}
