package study.practice.task04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BookStore {
    private long shelf;
    private String genre;
    private Map<Long, Book> store;

    public BookStore() {
        this.store = new HashMap<>();
    }

    public void addNewBook(Book book) {
        store.put(book.getId(), book);
    }

    public boolean removeBook(Book book) {
        if (!(book == null)) {
            store.remove(book.getId());
            return true;
        }
        return false;
    }

    public void showBookStore() {
        for (Map.Entry<Long, Book> s: store.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

    public Book getBook(Long id) {
        return store.get(id);
    }

    public void size() {
        System.out.println(store.size());
    }
}
