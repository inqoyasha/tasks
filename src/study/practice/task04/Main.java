package study.practice.task04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Book warAndPeaceBook = new Book(1l,
                                     "war and peace",
                                          1L,
                                         "Classic",
                                        10);
        bookStore.addNewBook(warAndPeaceBook);

        Manager manager = new Manager();
        Librarian librarian = new Librarian(bookStore);
        Library library = new Library(manager, librarian, bookStore);
        Visitor firstVisitor = new Visitor(1l, "Sasha Fedoseev" );


        //firstVisitor.takeBook(warAndPeaceBook);
        librarian.giveBook(firstVisitor, 1l);
        System.out.println(warAndPeaceBook.getInfoWhoTook());
        System.out.println(warAndPeaceBook.getTimeList());
        System.out.println(warAndPeaceBook);
    }
}
