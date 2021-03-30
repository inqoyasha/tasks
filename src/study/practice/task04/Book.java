package study.practice.task04;

import java.time.LocalDate;
import java.util.*;

public class Book {
    private Long bookId;
    private String bookName;
    private Integer counter;
    private BookStore bookStore;
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

    public Book(Long bookId,
                String bookName,
                BookStore bookStore,
                Integer counter) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookStore = bookStore;
        this.counter = counter;
        this.infoWhoTook = new LinkedList<>();
        this.timeList = new TreeMap<>();
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Long getShelf() {
        return bookStore.getShelf();
    }

    public void setShelf(Long shelf) {
        bookStore.setShelf(shelf);
    }

    public String getGenre() {
        return bookStore.getGenre();
    }

    public void setGenre(String genre) {
        bookStore.setGenre(genre);
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
