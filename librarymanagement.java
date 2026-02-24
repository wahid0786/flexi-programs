
import java.util.ArrayList;

class Book {

    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }     

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("----------------------");
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class librarymanagement {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("A Song of Ice and Fire", "George RR Martin", "101"));
        library.addBook(new Book("Python Guide", "Guido van Rossum", "102"));

        library.displayAllBooks();
    }
}
