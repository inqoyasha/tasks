package study.practice.task04;

import java.util.HashMap;
import java.util.Map;

public class BookStore {
    private Long shelf;
    private String genre;
    private Map<Long, Book> bookStore;

    public BookStore() {
        this.bookStore = new HashMap<>();
    }

    public Long getShelf() {
        return shelf;
    }

    public void setShelf(Long shelf) {
        this.shelf = shelf;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void addNewBook(Book book) {
        bookStore.put(book.getBookId(), book);
    }

    public boolean removeBook(Book book) {
        if (!(book == null)) {
            bookStore.remove(book.getBookId());
            return true;
        }
        return false;
    }

    public void showBookStore() {
        for (Map.Entry<Long, Book> s: bookStore.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

    public Book getBook(Long id) {
        return bookStore.get(id);
    }

    public void size() {
        System.out.println(bookStore.size());
    }
}
