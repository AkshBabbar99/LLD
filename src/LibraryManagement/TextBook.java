package LibraryManagement;

public class TextBook extends Book {
    private String subject;
    private int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author, BookType.TEXTBOOK);
        this.subject = subject;
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("TextBook Details:");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }
}
