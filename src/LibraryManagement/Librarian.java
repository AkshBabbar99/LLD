package LibraryManagement;

public class Librarian extends User {
    private String employeeNumber;

    public void addBook(){
        //add books
    }

    public void removeBook(){
        //remove books
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard" + "\nEmployee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return false;
    }
}
