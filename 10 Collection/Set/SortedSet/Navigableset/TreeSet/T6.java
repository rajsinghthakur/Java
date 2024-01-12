import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public int compareTo(Book bo) {
        return this.title.compareTo(bo.title);
    }

    public String toString() {
        return title + " " + pageCount + " ";
    }
}

class Comparable2 {
    public static void main(String[] args) {
        List<Book> ts = new ArrayList<Book>();
        ts.add(new Book("Java Programming", 500));
        ts.add(new Book("Python Basics", 300));
        ts.add(new Book("Data Structures", 600));

        Collections.sort(ts);
        for (Book book : ts) {
            System.out.println(book);
        }
    }
}
