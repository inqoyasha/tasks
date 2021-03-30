package study.practice.task04;

import java.util.List;
import java.util.Map;

public class Manager extends AbstractHuman {
    private Library library;
    private BookStore bookStore;

    public void openLibrary() {
        System.out.println(Manager.class.getName()  + ": I can open the library");
    }

    public void closeLibrary() {
        System.out.println(Manager.class.getName() + ": I can close the library");
    }

    public Book getBook(Long id) {
        return bookStore.getBook(id);
    }
}
