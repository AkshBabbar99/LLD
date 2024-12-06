package LibraryManagement;

public class Member extends User {
    private int borrowedBooksCount;
    public final int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
        this.borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard" + "\n. Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
