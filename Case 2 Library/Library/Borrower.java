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

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books :");
       
        if (borrowList.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowList) {
                System.out.println("Title : " +book.getTitle());
                System.out.println("ISBN : " +book.getISBN());
                System.out.println("Author : " +book.getAuthor().getName());
                System.out.println("Biography :" +book.getAuthor().getBio());
                System.out.println("-------------------------------------");
            }
        }
    }
}
