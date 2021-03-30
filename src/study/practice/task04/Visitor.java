package study.practice.task04;

import org.w3c.dom.ls.LSOutput;

public class Visitor extends AbstractHuman{
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeBook() { // one or more
        System.out.println("I can take the book");
    }

    public void returnBook() {
        System.out.println("I returned the book");
    }

    public void showBooks() {
        System.out.println("I can see list of books");
    }
}
