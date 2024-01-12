import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and setters for the attributes
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

public class O19 {
    private List<Book> books;

    public O19() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        books.add(book);
        System.out.println("Added book: " + title);
    }

    public void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Removed book with ISBN: " + isbn);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found in the collection.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The collection is empty.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        O19 collection = new O19();

        collection.addBook("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        collection.addBook("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        collection.addBook("1984", "George Orwell", "978-0451524935");

        collection.displayBooks();

        collection.removeBook("978-0061120084");

        collection.displayBooks();
    }
}
