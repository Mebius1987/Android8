
public class hw8 {

    public static void main(String[] args) {
       task10();
    }

    public static void task1() {
        int n = 30;
        int x;
        x = 1 << n;
        System.out.println(x);
    }

    public static void task2() {
        int n = 20;
        int m = 25;
        int x;
        x = (1 << n) + (1 << m);
        System.out.println(x);
    }

    public static void task3() {
        int n = 8;
        int a = 1234567;
        System.out.println(Integer.toString(a, 2));
        for (int i = 0; i < n; i++) {
            a = a & ~(1 << i);
        }
        System.out.println(Integer.toString(a, 2));
    }

    public static void task4() {
        int n = 8;
        int a = 12345672;
        System.out.println(Integer.toString(a, 2));
        a = a | (1 << (n - 1));
        System.out.println(Integer.toString(a, 2));
    }

    public static void task5() {
        int n = 8;
        int a = 1234567212;
        System.out.println(Integer.toString(a, 2));
        a = ~a;
        a = ~a | (1 << (n - 1));
        System.out.println(Integer.toString(a, 2));
    }

    public static void task6() {
        int n = 8;
        int a = 112122;
        int b = 1;
        System.out.println(Integer.toString(a, 2));
        for (int i = 1; i < n; i++) {
            b = b | (1 << i);
        }
        a = a & b;
        System.out.println(Integer.toString(a, 2));
    }

    public static void task7() {
        int n = 4;
        int a = 112122;
        System.out.println(Integer.toString(a, 2));
        System.out.println((((a >> (n - 1)) & 1) == 1) ? 1 : 0);
    }

    public static void task8() {
        short a = 11;
        String str = Integer.toString(a, 2);
        System.out.format("%016d%n", Integer.parseInt(str));
    }

    public static void task9() {
        int a = 0;
        int b = 0;
        int c = 0;
        int from = 1;
        int to = 32;
        for (int i = 0; i < 3; i++) {
            b = (int) (Math.random() * (to + 1 - from) + from);
            System.out.println("Bit " + b);
            c = 1 << (b - 1);
            a |= c;
        }
        System.out.println("New value - " + a);
    }

    public static void task10() {
        short a = 11;
        short b = 25;
        int c = 0;
        c = c | a;
        c = (c << 16) | b;
        System.out.println("a - " + (short) (c >> 16));
        System.out.println("b - " + (short) c);
    }
}
