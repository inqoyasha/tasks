package study.practice.task04;

import java.time.LocalDate;
import java.util.*;

public class Book {
    private long id;
    private String bookName;
    private int counter;
    private BookStore store;
    private Map<Long, Map<LocalDate, LocalDate>> timeList;
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

    public void setTimeList(Long id, LocalDate take, LocalDate back) {
        Map<LocalDate, LocalDate> curMap = new TreeMap<>();
        curMap.put(take, back);
        timeList.put(id, curMap);
    }

    public StringBuilder getTimeList() {
        for (Map.Entry<Long, Map<LocalDate, LocalDate>> entry: timeList.values()) {
            for (Map.Entry<LocalDate, LocalDate> entry1: entry.values())
        }
        return new StringBuilder(timeList);
    }



    public Long getInfoWhoTook() {
        return infoWhoTook.peekLast();
    }

    public void setInfoWhoTook(Long id) {
        infoWhoTook.push(id);
    }
}
