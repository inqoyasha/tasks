package study.practice.task04;

import java.util.List;
import java.util.Map;

public class Library {
    private Manager manager;
    private Librarian librarian;
    private Visitor visitor;
    private BookStore bookStore;

    public Library(Manager manager,
                   Librarian librarian,
                   BookStore bookStore) {
        this.manager = manager; 
        this.librarian = librarian;
        this.bookStore = bookStore;
    }

    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public Librarian getLibrarian() {
        return librarian;
    }
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    public Visitor getVisitor() {
        return visitor;
    }
    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
    public BookStore getBookStore() {
        return bookStore;
    }
    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
    }
}
