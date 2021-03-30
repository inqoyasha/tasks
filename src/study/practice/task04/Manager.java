package study.practice.task04;

import java.util.List;
import java.util.Map;

public class Manager extends AbstractHuman {
    public void openLibrary() {
        System.out.println(Manager.class.getName()  + ": I can open the library");
    }

    public void closeLibrary() {
        System.out.println(Manager.class.getName() + ": I can close the library");
    }

    public void getBook() {
        System.out.println(Manager.class.getName() + ": I can get a book from store");
    }


}
