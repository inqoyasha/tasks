package study.practice.task03;

import java.util.*;

public class Main {

    public static String[] parseToArray (String str) {
        return str.split(" ");
    }

    public static void main(String[] args) {

        String str = "2 + 2 - ( 3 * 4 ) + 7";
        String[] tokens = parseToArray(str);
        System.out.println(Arrays.toString(tokens));

    }
}




















//        System.out.println(new Add(new Const(1), new Const(2)).evaluate());; // "5 + 5" 10
//        System.out.println( // "5 * 2 - 1 + 2" 11
//                new Add(
//                    new Sub(
//                        new Multi(
//                            new Const(5), new Const(2)
//                        ), new Const(1)
//                    ), new Const(2)
//                ).evaluate()
//        );;