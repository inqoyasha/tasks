package study.practice.task04;

import java.time.LocalDate;
import java.util.*;

public class Book {
    private long id;
    private String bookName;
    private int counter;
    private BookStore store;
    private TreeMap<Long, DateMap> timeList;
    private LinkedList<Long> infoWhoTook;

    static class DateMap {
        private TreeMap<LocalDate, LocalDate> dateMap;

        public DateMap() {
            this.dateMap = new TreeMap<>();
        }

        public StringBuilder getDateMap() {
            return new StringBuilder(dateMap.lastEntry().toString());
        }

        public void setDateMap(LocalDate take, LocalDate back) {
            dateMap.put(take, back);
        }
    }

    public Book(long id,
                String bookName,
                BookStore store,
                int counter) {
        this.id = id;
        this.bookName = bookName;
        this.store = store;
        this.counter = counter;
        this.infoWhoTook = new LinkedList<>();
        this.timeList = new TreeMap<>();
    }

    public void setTimeList(Long id, LocalDate take, LocalDate back) {
        DateMap dateMap = new DateMap();
        dateMap.setDateMap(take, back);
        timeList.put(id, dateMap);
    }

    public StringBuilder getTimeList() {
        return new StringBuilder(timeList.lastEntry().toString());
    }



    public Long getInfoWhoTook() {
        return infoWhoTook.peekLast();
    }

    public void setInfoWhoTook(Long id) {
        infoWhoTook.push(id);
    }
}
