package study.practice.task04;

import java.util.List;
import java.util.Map;

public class Library {
    private Manager manager;
    private Librarian librarian;
    private Map<String, Book> bookStore;

    public Library(Manager manager,
                   Librarian librarian,
                   Map<String, Book> bookStore) {
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

    public Map<String, Book> getBookStore() {
        return bookStore;
    }

    public void setBookStore(Map<String, Book> bookStore) {
        this.bookStore = bookStore;
    }
}
