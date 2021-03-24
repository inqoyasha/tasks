package study.practice.task04;

import java.util.List;
import java.util.Map;

public class BookStore {
    private static BookStore instance;
    private Map<String, List<Book>> store;

    private BookStore(Map<String, List<Book>> store) {
        this.store = store;
    }

    public static BookStore getInstance(Map<String, List<Book>> store) {
        if (instance == null) {
            instance = new BookStore(store);
        }
        return instance;
    }
}
