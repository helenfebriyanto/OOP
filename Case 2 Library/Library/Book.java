public class Book {
    private String bookTitle;
    private String isbn;
    private Author author;

    public Book(String bookTitle, String isbn, Author author) {
        this.bookTitle = bookTitle;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return bookTitle;
    }

    public String getISBN() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }
}
