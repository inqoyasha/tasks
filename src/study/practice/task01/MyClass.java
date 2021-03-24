package study.practice.task01;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = -10; i <= 10; i++) {
            list.add(i);
        }
        list.forEach(System.out::println);

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer el: list) {
            if (el % 2 != 0) newList.add(el);
        }
//        newList.forEach(System.out::println);

        list.removeAll(newList);

        list.forEach(System.out::println);
    }
}
