
import java.util.Scanner;

public class hw4 {

public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    task9();
    task10();
    task11();
    task12();
    task13();
}

public static void task1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number");
    int a = sc.nextInt();
    System.out.println("Number is " + ((a % 2 == 0) ? "even" : "uneven"));
}

public static void task2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 3 numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("Min - " + (a < b && a < c ? a : b < c ? b : c));
}

public static void task3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number");
    int a = sc.nextInt();
    if (a > 0) {
        System.out.println("Positive");
    } else if (a == 0) {
        System.out.println("Zero");
    } else {
        System.out.println("Negative");
    }
    System.out.println();
}

public static void task4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number a");
    int a = sc.nextInt();
    System.out.println("Input number b");
    int b = sc.nextInt();
    System.out.println("Choose action:\n1)a+b\n2)a-b\n3)a*b\n4)a/b\n5)a%b");
    int calc = sc.nextInt();
    switch (calc) {
        case 1:
            System.out.println("a+b=" + a + "+" + b + "=" + (a + b));
            break;
        case 2:
            System.out.println("a-b=" + a + "-" + b + "=" + (a - b));
            break;
        case 3:
            System.out.println("a*b=" + a + "*" + b + "=" + (a * b));
            break;
        case 4:
            if (b == 0) {
                System.err.println("Divide by zero");
                break;
            } else {
                System.out.println("a/b=" + a + "/" + b + "=" + ((double) a / b));
                break;
            }
        case 5:
            if (b == 0) {
                System.err.println("Divide by zero");
                break;
            } else {
                System.out.println("a%b=" + a + "%" + b + "=" + (a % b));
                break;
            }
        default:
            System.err.println("Incorrect input");
    }
}

public static void task5() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input string");
    String str = sc.nextLine();
    System.out.println(str);
    for (char c : str.toCharArray()) {
        if ((c + "").matches("\\d")) {
            System.out.println(c + " - digit");
        } else if ((c + "").matches("[a-zA-Zà-ÿÀ-ß]")) {
            System.out.println(c + " - letter");
        } else if ((c + "").matches("\\p{Punct}")) {
            System.out.println(c + " - punctuation");
        } else if ((c + "").matches("\\p{Blank}")) {
            System.out.println(c + " - space");
        } else {
            System.out.println(c + " - other");
        }
    }
}

public static void task6() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input start of range");
    int n = sc.nextInt();
    System.out.println("Input end of range");
    int m = sc.nextInt();
    System.out.println("Input number");
    int a = sc.nextInt();
    if (a >= Math.min(n, m) && a <= Math.max(n, m)) {
        System.out.println("included in the range");
    } else {
        System.out.println("not included in the range");
    }
}

public static void task7() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number x");
    int x = sc.nextInt();
    System.out.println("Input number y");
    int y = sc.nextInt();
    if (x % y == 0) {
        System.out.println(x + " is a multiple of the " + y);
    } else {
        System.out.println(x + " is not a multiple of the " + y);
    }
}

public static void task8() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number");
    int a = sc.nextInt();
    if ((a % 3 + a % 5 + a % 7) == 0) {
        System.out.println("You are lucky");
    } else {
        System.out.println("Try again");
    }
}

public static void task9() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number");
    int a = sc.nextInt();
    System.out.println("abs " + ((a < 0) ? a = -a : a));
}

public static void task10() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number (up to 4 digits)");
    int a = sc.nextInt();
    if (a < 9999 && a > -9999) {
        System.out.println((a + "").length() + " digits");
    } else {
        System.out.println("Easier. Too much digits");
    }
}

public static void task11() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number (5 digits)");
    int a = sc.nextInt();
    a = Math.abs(a);
    if ((a + "").length() == 5) {
        System.out.println((a / 10000 == a % 10 && a / 1000 % 10 == a / 10 % 10) ? "Cool" : "Sucks");
    } else {
        System.out.println("Need only 5 digits");
    }
}

public static void task12() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input coordinates of the upper left corner (x first, y second)");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    System.out.println("Input coordinates of the lower right corner (x first, y second)");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    if (x2 > x1 && y2 < y1) {
        System.out.println("Input point coordinates (x first, y second)");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((x >= x1 && x <= x2 && y <= y1 && y >= y2) ? "Point in" : "Point out");
    } else {
        System.err.println("Incorrect coordinates of corner");
    }
}

public static void task13() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 4 numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    System.out.println("Max " + (a > b && a > c && a > d ? a : b > c && b > d ? b : c > d ? c : d));
}

}
