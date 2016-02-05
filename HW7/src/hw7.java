
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class hw7 {

public static void main(String[] args) {

    task22();
}

public static void task1() {
    int nums = 100000;
    int from = -100;
    int to = 100;
    int positive = 0;
    int negative = 0;
    int zero = 0;
    int even = 0;
    int odd = 0;
    System.out.println("Task1");
    for (int i = 1; i <= nums; i++) {
        int a = (int) (Math.random() * (to - from) + from);
        if (a > 0) {
            positive++;
        } else if (a < 0) {
            negative++;
        } else {
            zero++;
        }
        if (a % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }
    System.out.println("Positive - " + (int) (100 * positive / nums) + "%");
    System.out.println("Negative - " + (int) (100 * negative / nums) + "%");
    System.out.println("Zero - " + (int) (100 * zero / nums) + "%");
    System.out.println("Even - " + (int) (100 * even / nums) + "%");
    System.out.println("Odd - " + (int) (100 * odd / nums) + "%");
}

public static void task2() {
    System.out.println("Task 2");
    for (int b = 1; b <= 10; b++) {
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + "x" + b + "=" + a * b + "\t");
        }
        System.out.println();
    }
}

public static void task3() {
    double rashodi = 1500;
    double stipendia = 500;
    int month = 10;
    int inflyacia = 3;
    double rashodiAll = 0;
    double stipendiaAll;

    for (int i = 1; i <= month; i++) {
        rashodiAll += rashodi * Math.pow((double) (100 + inflyacia) / 100, i);
    }
    stipendiaAll = stipendia * month;
    double needMoney = rashodiAll - stipendiaAll;
    System.out.println("To survive student need " + (needMoney > 0 ? needMoney : 0));
} // исправить названия и текст

public static void task4() {
    int m = 30;
    int n = 9;
    String str1 = "*";
    String str0 = " ";

    for (int y = 1; y <= n; y++) {
        for (int x = 1; x <= m; x++) {
            System.out.print(str1);
        }
        System.out.println();
    }

    System.out.println();

    for (int y = 1; y <= n; y++) {
        for (int x = 1; x <= m; x++) {
            if (x == 1 || x == m || y == 1 || y == n) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
}

public static void task5() {
    int m = 10;
    String str1 = "* ";
    String str0 = "  ";

    for (int y = 1; y <= (m); y++) {
        for (int x = 1; x <= (m * 2 - 1); x++) {
            if (x >= (m - y + 1) && x <= (m + y - 1)) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }

    System.out.println();

    for (int y = 1; y <= (m); y++) {
        for (int x = 1; x <= (m * 2 - 1); x++) {
            if (x == (m - y + 1) || x == (m + y - 1) || y == m) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
}

public static void task6() {
    int m = 10;
    String str1 = "* ";
    String str0 = "  ";

    for (int y = 1; y <= (m * 2 - 1); y++) {
        for (int x = 1; x <= (m * 2 - 1); x++) {
            if (x >= (m - y + 1) && x <= (m + y - 1) && x >= (y - m + 1) && x <= (3 * m - y - 1)) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }

    System.out.println();

    for (int y = 1; y <= (m * 2 - 1); y++) {
        for (int x = 1; x <= (m * 2 - 1); x++) {
            if (x == (m - y + 1) || x == (m + y - 1) || x == (y - m + 1) || x == (3 * m - y - 1)) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
}

public static void task7() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number: ");
    String num = sc.next();
    boolean palindrom = false;
    for (int i = 0; i < num.length() / 2; i++) {
        palindrom = num.charAt(i) == num.charAt(num.length() - 1 - i);
        if (!palindrom) {
            break;
        }
    }
    System.out.println("This number is " + (palindrom ? "" : "not") + " palindrom");
}

public static void task8() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number (5 digits): ");
    int num = sc.nextInt();
    int sdvig = 2;
    int digs = Integer.toString(num).length();
    for (int i = 1; i <= sdvig; i++) {
        num = num % 10 * (int) Math.pow(10, digs - 1) + num / 10;
    }
    System.out.println(num);
    System.out.println();
}

public static void task9() {
    int a = 8;
    int b = 10;
    int c = 5;
    String str1 = "* ";
    String str2 = "' ";
    String str0 = "  ";

    for (int y = 1; y <= (a + c - 1); y++) {
        for (int x = 1; x <= (b + c - 1); x++) {
            if ((x >= c && y == 1) || (x == c - y + 1 || x == c - y + b && y <= c) || (y > c - 1 && x == 1)
                    || (y > c - 1 && x == b) || (x <= b && y == a + c - 1) || (x <= b && y == c)
                    || (x == b + c - 1 && y <= a) || (x == b + a + c - y - 1 && y >= a)) {
                System.out.print(str1);
            } else if ((x == c && y <= a) || (x == a + c - y && y >= a) || (x >= c && y == a)) {
                System.out.print(str2);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
}

public static void task10() {

    int start = 2;
    int end = 10000000;
    for (int i = start; i <= end; i++) {
        for (int j = 2; j <= i; j++) {
            if (i % j == 0 && j != i) {
                break;
            } else if (i == j) {
                System.out.println(i + " - prime number");
            }
        }
    }
}

public static void task11() {
    int start = 0;
    int end = 10000000;
    int num;
    int pow;
    int sum;
    for (int i = start; i <= end; i++) {
        num = i;
        pow = 0;
        while (num > 0) {
            num /= 10;
            pow++;
        }
        num = i;
        sum = 0;
        while (num > 0) {
            sum += Math.pow(num % 10, pow);
            num /= 10;
        }
        if (sum == i) {
            System.out.println(i + " is Armstrong number");
        }
    }
}

public static void task12() {
    int start = 0;
    int end = 10000000;
    int sum;
    for (int i = start; i <= end; i++) {
        sum = 0;
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }
        if (sum == i) {
            System.out.println(i + " is perfect number");
        }
    }
}

public static void task13() {
    int end = 10000000;
    int a = 1;
    int b = 1;
    while (b <= end) {
        System.out.println(b);
        b = a + b;
        a = b - a;
    }
}

public static void task14() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input year :");
    int y = sc.nextInt();

    String[] mon = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov",
        "Dec"};
    for (int m = 0; m <= 11; m++) {
        System.out.println("\n");
        GregorianCalendar cal = new GregorianCalendar(y, 0 + m, 1);
        System.out.println("\t\t" + mon[cal.get(Calendar.MONTH)]);
        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 0);
        System.out.print(new String(new char[cal.get(Calendar.DAY_OF_WEEK) - 1]).replace("\0", "\t"));
        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            System.out.print(i);
            cal.add(Calendar.DAY_OF_MONTH, 1);
            if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.print("\n");
            } else {
                System.out.print("\t");
            }
        }
    }
}

public static void task15() {
    int len = 14;
    int num = 5;
    String str1 = "*";
    String str0 = " ";

    for (int i = 1; i <= num; i++) {
        for (int a = 1; a <= i; a++) {
            System.out.print(str0);
        }
        for (int j = 1; j <= len; j++) {
            System.out.print(str1);
        }
        System.out.print("\n");
    }
}

public static void task16() {
    int len = 3;
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number:");
    int num = sc.nextInt();
    String str1 = "*";
    String str0 = " ";

    for (int i = 0; i < num; i++) {
        for (int a = 1; a <= (len - 1) * i; a++) {
            System.out.print(str0);
        }
        for (int j = 1; j <= len; j++) {
            System.out.print(str1);
        }
        System.out.print("\n");
        for (int a = 1; a <= (len - 1) * (i + 1); a++) {
            System.out.print(str0);
        }
        System.out.print(str1 + "\n");
    }
}

public static void task17() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input odd number:");
    int num = sc.nextInt();
    if (num % 2 == 0) {
        System.out.println("Incorrect input");
        return;
    }

    String str1 = "*";
    String str0 = " ";

    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 || y == num || x == 1 || x == num || x == y) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 || y == num || x == 1 || x == num || num - x + 1 == y) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 || y == num || x == 1 || x == num || x == num / 2 + 1) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 || y == num || x == 1 || x == num || y == num / 2 + 1) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 && x <= num / 2 + 1 || y == num && x >= num / 2 + 1 || x == 1 && y <= num / 2 + 1
                    || x == num && y >= num / 2 + 1 || x == y) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 && x >= num / 2 + 1 || y == num && x <= num / 2 + 1 || x == 1 && y >= num / 2 + 1
                    || x == num && y <= num / 2 + 1 || num - x + 1 == y) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 || y == num || x == 1 || x == num || x == y || num - x + 1 == y) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (x == 1 || x == num || x == y || num - x + 1 == y) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 || y == num || x == y || num - x + 1 == y) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 || y == num || x == 1 || x == num || x == num / 2 + 1 || y == num / 2 + 1) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 && x > 1 && x <= num / 2 || y == num && x < num && x > num / 2 + 1
                    || x == 1 && y > 1 && y <= num / 2 || x == num && y > num / 2 + 1 && y < num
                    || x == num / 2 + 1 && y != 1 && y != num && y != num / 2 + 1
                    || y == num / 2 + 1 && x != 1 && x != num && x != num / 2 + 1) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
    System.out.println();
    for (int y = 1; y <= num; y++) {
        for (int x = 1; x <= num; x++) {
            if (y == 1 && x > num / 2 + 1 && x < num || y == num && x > 1 && x < num / 2 + 1
                    || x == 1 && y > num / 2 + 1 && y < num || x == num && y > 1 && y < num / 2 + 1
                    || x == num / 2 + 1 && y != 1 && y != num && y != num / 2 + 1
                    || y == num / 2 + 1 && x != 1 && x != num && x != num / 2 + 1) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
}

public static void task18() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number:");
    int h = sc.nextInt();
    String str1 = " *";
    String str0 = "  ";

    for (int y = 1; y <= (h * 2 - 1); y++) {
        for (int x = 1; x <= (h * 2 - 1); x++) {
            if (x == h - y + 1 || x == h + y - 1 || y == h || y == h * 2 - 1 || x == 1 && y > h
                    || x == h * 2 - 1 && y > h || y == h + h / 4 && x >= h / 2 + 1 && x <= 2 * h - 1 - h / 2
                    || y == 2 * h - 1 - h / 4 && x >= h / 2 + 1 && x <= 2 * h - 1 - h / 2
                    || x == h / 2 + 1 && y >= h + h / 4 && y <= 2 * h - 1 - h / 4
                    || x == 2 * h - 1 - h / 2 && y >= h + h / 4 && y <= 2 * h - 1 - h / 4
                    || y < x - h + 1 && x >= 2 * h - 1 - h / 2 && x <= 2 * h - 1 - h / 4 && y != 1) {
                System.out.print(str1);
            } else {
                System.out.print(str0);
            }
        }
        System.out.println();
    }
}

public static void task19() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number of stages:");
    int num = sc.nextInt();
    System.out.print("Input height of stage:");
    int h = sc.nextInt();
    String str = "<>";
    for (int i = 0; i < num; i++) {
        for (int j = 0; j < h; j++) {
            for (int a = 1; a <= (h - j + num - i - 1); a++) {
                System.out.print("  ");
            }
            for (int a = 1; a <= (i * 2 + 1 + j * 2); a++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
    for (int i = 0; i < num; i++) {
        for (int a = 0; a < num + h + 1 - 3; a++) {
            System.out.print("  ");
        }
        for (int j = 0; j < 3; j++) {
            System.out.print(str);
        }
        System.out.println();
    }
}

public static void task20() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input year:");
    int yx = sc.nextInt();
    if (yx < 0) {
        System.out.println("Incorrect input");
        return;
    }
    boolean yVesokos = (yx % 4 == 0 && yx % 100 != 0) || yx % 400 == 0;
    System.out.println("Input month");
    int mx = sc.nextInt();
    if (mx < 1 || mx > 12) {
        System.out.println("Incorrect input");
        return;
    }
    System.out.print("Input day of month:");
    int dx = sc.nextInt();
    if (dx < 1 || dx > 31 || (mx == 2 && yVesokos && dx > 29) || (mx == 2 && !yVesokos && dx > 28)
            || (dx == 31 && (mx == 4 || mx == 6 || mx == 9 || mx == 11))) {
        System.out.println("Incorrect input");
        return;
    }

    final int y = 2001;
    final int m = 1;
    final int d = 1;
    int dname = 0;
    int days = 0;
    days = (yx - y) * 365 + (yx / 4 - yx / 100 + yx / 400) - (y / 4 - y / 100 + y / 400);
    if (yVesokos) {
        days--;
    }
    switch (mx) {
        case 12:
            days += 30;
        case 11:
            days += 31;
        case 10:
            days += 30;
        case 9:
            days += 31;
        case 8:
            days += 31;
        case 7:
            days += 30;
        case 6:
            days += 31;
        case 5:
            days += 30;
        case 4:
            days += 31;
        case 3:
            if (yVesokos) {
                days += 29;
            } else {
                days += 28;
            }
        case 2:
            days += 31;
        case 1:
            days += dx - 1;
    }
    if (y > yx || (y == yx && m > mx) || (y == yx && m == mx && d > dx)) {
        dname += 7;
    }
    dname += days % 7;
    String[] names = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    System.out.println(names[dname]);
}

public static void task21() {
    int start = 1;
    int end = 99999;
    int badNums = 0;
    int temp1, temp2;
    boolean isBadNum;
    for (int i = start; i <= end; i++) {
        temp1 = i;
        isBadNum = false;
        while (temp1 > 0) {
            if (temp1 % 10 == 4) {
                isBadNum = true;
            }
            temp1 /= 10;
        }
        temp2 = i;
        while (temp2 > 0) {
            if (temp2 % 100 == 13) {
                isBadNum = true;
            }
            temp2 /= 10;
        }
        if (isBadNum) {
            System.out.println(i);
            badNums++;
        }
    }
    System.out.println("Total:" + badNums);
}

public static void task22() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number:");
    int num = sc.nextInt();
    int pow = 0;
    int dig;
    String str1;
    String str0 = " ";
    for (int i = num; i > 0; i /= 10) {
        pow++;
    }

    for (int y = 1; y <= 7; y++) {
        for (int n = 1; n <= pow; n++) {
            dig = num / (int) Math.pow(10, pow - n) % 10;
            str1 = dig + "";
            for (int x = 1; x <= 7; x++) {
                if (dig == 0) {
                    if ((y == 1 || y == 7) && x > 2 && x < 6 || (y == 2 || y == 6) && (x == 2 || x == 6)
                            || y > 2 && y < 6 && (x == 1 || x == 7)) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 1) {
                    if (x == 4 || y == 2 && x == 3 || y == 7 && (x == 3 || x == 5)) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 2) {
                    if (y == 7 || y == 1 && (x == 3 || x == 4 || x == 5) || x == 1 && (y == 2 || y == 3)
                            || x == 7 - y + 1 && x != 7) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 3) {
                    if ((y == 1 || y == 4 || y == 7) && x > 2 && x < 6 || y != 1 && y != 4 && y != 7 && x == 7) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 4) {
                    if (y == 5 || x == 5 || x == 6 - y) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 5) {
                    if ((y == 3 || y == 7) && x > 2 && x < 6 || x == 1 && (y == 2 || y == 3)
                            || x == 7 && y > 3 && y < 7 || y == 1 || x == 1 && y == 6) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 6) {
                    if (x == 1 && y != 1 && y != 7 || (y == 1 || y == 7) && x > 1 && x < 6 || y == 4 && x < 6
                            || x == 7 && (y == 5 || y == 6)) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 7) {
                    if (y == 1 || x == 8 - y) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 8) {
                    if ((y == 1 || y == 4 || y == 7) && x > 2 && x < 6
                            || y != 1 && y != 4 && y != 7 && (x == 7 || x == 1)) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                } else if (dig == 9) {
                    if (x == 7 && y != 7 && y != 1 || (y == 1 || y == 4 || y == 7) && x > 2 && x < 7
                            || x == 1 && (y == 2 || y == 3)) {
                        System.out.print(str1);
                    } else {
                        System.out.print(str0);
                    }
                }
            }
            System.out.print(str0);
        }
        System.out.println();
    }
}
}
