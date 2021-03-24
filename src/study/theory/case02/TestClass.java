package study.theory.case02;

public class TestClass {
    private static void int_( int x) {
        System.out.println("int: " + x);
    }
    private static void integer_( Integer x) {
        System.out.println("Integer: " + x);
    }

    public static void main(String[] args) {
        int intX = 0;
        Integer integer = Integer.valueOf(0);

        int_(intX);
        int_(integer);

        integer_(intX);
        integer_(integer);

        Byte a = 10;
        Byte b = 10;
        Short c = -128;
        Short d = -128;
        Short e = 128;
        Short f = 128;
        Character j = 127;
        Character h = 127;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(j == h);
    }
}
