package study.practice.task04;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Book {
    private long id;
    private String bookName;
    private int bookShelf;
    private String genre;
    private Map<LocalDate, LocalDate> timeLIst;
    private List<Integer> infoWhoTook;

    public Book(long id, String bookName, int bookShelf, String genre, Map<LocalDate, LocalDate> timeLIst, List<Integer> infoWhoTook) {
        this.id = id;
        this.bookName = bookName;
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.timeLIst = timeLIst;
        this.infoWhoTook = infoWhoTook;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(int bookShelf) {
        this.bookShelf = bookShelf;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Map<LocalDate, LocalDate> getTimeLIst() {
        return timeLIst;
    }

    public void setTimeLIst(Map<LocalDate, LocalDate> timeLIst) {
        this.timeLIst = timeLIst;
    }

    public List<Integer> getInfoWhoTook() {
        return infoWhoTook;
    }

    public void setInfoWhoTook(List<Integer> infoWhoTook) {
        this.infoWhoTook = infoWhoTook;
    }

}
