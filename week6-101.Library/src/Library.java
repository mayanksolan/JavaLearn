
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private final StringUtils util;

    public Library() {
        this.book = new ArrayList<Book>();
        this.util = new StringUtils();
    }

    public void addBook(Book newBook) {
        this.book.add(newBook);
    }

    public void printBooks() {
        for (Book b : book) {
            System.out.println(b.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b : book) {
            if (util.included(b.title(), title)) {
                found.add(b);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b : book) {
            if (util.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b : book) {
            if (b.year() == year) {
                found.add(b);
            }
        }
        return found;
    }
}
