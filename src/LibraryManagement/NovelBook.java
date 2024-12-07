package LibraryManagement;

public class NovelBook extends Book {

    private String genre;

    public NovelBook(String isbn, String title, String author, String genre){
        super(isbn, title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook Details:");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + this.genre);
        System.out.println("Author: " + getAuthor());
    }
}
