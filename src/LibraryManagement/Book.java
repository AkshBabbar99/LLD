package LibraryManagement;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private BookType bookType;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author, BookType bookType) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.bookType = bookType;
    }

    public abstract void displayBookDetails();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookType getBookType() {
        return bookType;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        user.returnBook(this);
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
}
