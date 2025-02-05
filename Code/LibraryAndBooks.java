import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author);
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Book book1 = new Book("ABCD", "Prashant");
        Book book2 = new Book("EFGH", "Shivangi");

        Library library1 = new Library();
        Library library2 = new Library();

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book1);

        System.out.println("Library 1 Books:");
        library1.displayBooks();

        System.out.println("Library 2 Books:");
        library2.displayBooks();
    }
}
