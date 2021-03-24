package study.theory.case01;

import study.theory.case01.Player;
import study.theory.case01.User;

public class HelloWorld {
    public static void main(String... args) {
        User user;
        User user1 = new Player();

        System.out.println(null == null);
        System.out.println(user1 instanceof User);
        System.out.println(user1 instanceof Player);


    }
}
