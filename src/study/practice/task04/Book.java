package study.practice.task04;

import java.time.LocalDate;
import java.util.*;

public class Book {
    private Long bookId;
    private String bookName;
    private Integer counter;
    private Long shelf;
    private String genre;
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

        @Override
        public String toString() {
            return "DateMap{" +
                    "dateMap=" + dateMap +
                    '}';
        }
    }

    public Book(Long bookId,
                String bookName,
                Long shelf,
                String genre,
                Integer counter) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.counter = counter;
        this.genre = genre;
        this.shelf = shelf;
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

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", counter=" + counter +
                ", shelf=" + shelf +
                ", genre='" + genre + '\'' +
                ", timeList=" + timeList +
                ", infoWhoTook=" + infoWhoTook +
                '}';
    }
}
