package LibraryManagement;

public class Member extends User {
    private int borrowedBooksCount;
    public static final int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
        this.borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo){
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Number of books borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
