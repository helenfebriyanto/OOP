import java.util.ArrayList;
import java.util.List;
public class Borrower {
    private String name;
    private List<Book> borrowList;

    public Borrower(String name){
        this.name=name;
        this.borrowList= new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        borrowList.add(book);
    }

    public void returnBook(Book book){
        borrowList.remove(book);
    }

    public void displayBorrowedBooks(Book book){
        System.out.println(name + "borrow list");
        System.out.println("-------------------------------------");
        for (Book books : borrowList) {
            System.out.println("Book Title : " +books.getTitle());
            System.out.println("Book ISBN : " +books.getISBN());
            System.out.println("Book Author : " +books.getAuthor().getName());
            System.out.println("======================================");
        }
    }
}
