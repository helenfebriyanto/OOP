import java.util.ArrayList;
import java.util.List;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library: " +book.getTitle());
    }
    public void returnBook(Borrower borrower, Book book){
        borrower.returnBook(book);
        books.add(book);
        System.out.println(borrower.getName() + " returned: " +book.getTitle());
    }
    public void borrowBook(Borrower borrower, Book book){
        if(books.contains(book)){
            books.remove(book);
            borrower.borrowBook(book);
            System.out.println(borrower.getName() + " borrowed:" +book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }
    public void displayLibraryBooks(){
        System.out.println("Books in Library : ");
        if(books.isEmpty()){
            System.out.println("No Books in Library");
        } else {
            for (Book book : books) {
                System.out.println("Title :" +book.getTitle());
                System.out.println("ISBN : " +book.getISBN());
                System.out.println("Author : " +book.getAuthor().getName());
                System.out.println("Biography : " +book.getAuthor().getBio());
                System.out.println("----------------------------------------------");
            }
        }
    }
}
