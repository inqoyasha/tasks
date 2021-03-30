package study.practice.task04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Librarian extends AbstractHuman {
    BookStore bookStore;

    public Librarian(BookStore bookStore) {
       this.bookStore = bookStore;
    }

    public void giveBook(Visitor visitor, Long id) {
        Book book = bookStore.getBook(id);
        book.setInfoWhoTook(visitor.getId());

    }

    public void addNewBook() {
        System.out.println("I can add a new book");
    }

    public void showWhoTookBook() { //param Book
        System.out.println("Map or something, show book, date, name or id");
    }

    public void remindVisitor() { //param Visitor
        System.out.println("Send a message for some visitor");
    }
}
