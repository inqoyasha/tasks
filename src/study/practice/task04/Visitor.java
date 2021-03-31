package study.practice.task04;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends AbstractHuman {

    private Long id;
    private String name;
    private Library library;
    private List<Book> books;

    public Visitor(Long id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void takeBook(Book book) { // one or more
        books.add(book);
    }

    public void returnBook(Book book) {
        books.remove(book);
//        Library.takeBook(book); // library must know about this book
    }

    public void showBooks() {
//        Library.showBooks(); // library can show list of books
    }
}
