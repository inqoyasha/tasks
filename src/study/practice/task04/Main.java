package study.practice.task04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Librarian librarian = new Librarian();
        Map<String, Book> bookStore = new HashMap<>();
        Book book1 = new Book(1L,"World and War", 1, "Classic");
        Book book2 = new Book(2L,"World and War", 1, "Classic");
        bookStore.put("1", book1);
        BookStore bookStore1 = new BookStore();
        System.out.println(bookStore1.addNewBook(book1));
        System.out.println(bookStore1.addNewBook(book2));
        bookStore1.size();
//        System.out.println(bookStore1.removeBook(book1));
//        System.out.println(bookStore1);
        bookStore1.showBookStore();
        Library libraryGorkogo = new Library(manager, librarian, bookStore);
        manager.closeLibrary();
    }
}
