package study.practice.task04;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Librarian extends AbstractHuman {

    private BookStore bookStore;

    public Librarian(BookStore bookStore) {
       this.bookStore = bookStore;
    }

    public void giveBook(Visitor visitor, Long id) {
        Book book = bookStore.getBook(id);
        book.setInfoWhoTook(visitor.getId());
        book.setTimeList(visitor.getId(), LocalDate.now(), LocalDate.now().plusDays(7));
        visitor.takeBook(book);
    }

    public void addNewBook(Book book) {
        bookStore.addNewBook(book);
    }

    public void showWhoTookBook(Book book) { //param Book
        book.getInfoWhoTook();
    }

    public void remindVisitor() { //param Visitor
        System.out.println("Send a message for some visitor");
    }
}
