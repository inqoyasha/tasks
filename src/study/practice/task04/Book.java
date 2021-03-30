package study.practice.task04;

import java.time.LocalDate;
import java.util.*;

public class Book {
    private long id;
    private String bookName;
    private int counter;
    private BookStore store;
    private Map<LocalDate, LocalDate> timeList;
    private LinkedList<Long> infoWhoTook;

    public Book(long id,
                String bookName,
                BookStore store,
                int counter) {
        this.id = id;
        this.bookName = bookName;
        this.store = store;
        this.counter = counter;
        this.infoWhoTook = new LinkedList<>();
        this.timeList = new Hashtable<>();
    }

    public Long getInfoWhoTook() {
        return infoWhoTook.pop();
    }

    public void setInfoWhoTook(Long id) {
        List<Long> infoList = infoWhoTook;
        infoWhoTook.add(id);
    }
}
