import java.util.Comparator;
import java.util.TreeSet;

class Book {
    private int bookNo;
    private String bookname;
    private double bookCost;

    public Book(int bookNo, String bookname, double bookCost) {
        this.bookNo = bookNo;
        this.bookname = bookname;
        this.bookCost = bookCost;
    }

    public String getBookName() {
        return bookname;
    }

    public String toString() {
        return bookNo + " " + bookname + " " + bookCost + " ";
    }
}

class sortByName implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getBookName().compareTo(b2.getBookName());
    }
}

class Comparator2 {
    public static void main(String[] args) {
        TreeSet<Book> ts = new TreeSet<Book>(new sortByName());
        ts.add(new Book(21, "C", 32));
        ts.add(new Book(4, "A", 12));
        ts.add(new Book(2, "B", 34));

        for (Book book : ts) {
            System.out.println(book);
        }
    }
}
