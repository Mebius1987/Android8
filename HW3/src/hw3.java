
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Scanner;

public class hw3 {

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
    task14();
    task15();
    task16();
    task17();
    task18();
    task19();
}

public static void task1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input distance (km)");
    int s = sc.nextInt();
    s *= 1000;
    System.out.println("Input speed (m/sec)");
    int v = sc.nextInt();
    int hours = s / v / 3600;
    int minutes = (s / v % 3600 / 60);
    int seconds = (s / v % 60);
    System.out.print("Runing time: ");
    if (hours > 0) {
        System.out.print(hours + " hours ");
    }
    if (minutes > 0) {
        System.out.print(minutes + " minutes ");
    }
    System.out.println(seconds + " seconds");
    System.out.println();
}

public static void task2() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input number a");
    double a = sc.nextDouble();
    System.out.println("Input number b");
    double b = sc.nextDouble();
    System.out.println("Sum of parts: " + ((int) a + (int) b) + " , " + (a % 1 + b % 1));
    System.out.println();
}

public static void task3() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input sum (UAH)");
    double uah = sc.nextDouble();
    System.out.println((int) uah + " hryvnia " + (int) (uah % 1 * 100) + " cents");
    System.out.println();
}

public static void task4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input mass (tons)");
    double mass = sc.nextDouble();
    int tones = (int) mass;
    int kg = (int) (mass % 1 * 1000);
    int gr = (int) ((mass * 1000) % 1 * 1000);

    if (tones > 0) {
        System.out.print(tones + " tons ");
    }
    if (kg > 0) {
        System.out.print(kg + " kg ");
    }
    if (gr > 0) {
        System.out.print(gr + " grams");
    }
    System.out.println("\n");
}

public static void task5() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input seconds");
    int s = sc.nextInt();
    int days = s / (60 * 60 * 24);
    int hours = s % (60 * 60 * 24) / (60 * 60);
    int minutes = s % (60 * 60) / 60;
    int seconds = s % 60;

    if (days > 0) {
        System.out.print(days + " days ");
    }
    if (hours > 0) {
        System.out.print(hours + " hours ");
    }
    if (minutes > 0) {
        System.out.print(minutes + " minutes ");
    }
    if (seconds > 0) {
        System.out.print(seconds + " seconds ");
    }
    System.out.println("\n");
}

public static void task6() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input distance (km)");
    double s = sc.nextDouble();
    System.out.println("Input time (mins)");
    int t = sc.nextInt();
    System.out.format("Speed %.2f km/h", s / ((double) t / 60));
    System.out.println("\n");
}

public static void task7() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input start time (format xx:xx:xx)");
    String start = sc.next();
    if (!start.matches("\\d\\d:\\d\\d:\\d\\d")) {
        System.err.println("Incorrect input");
        return;
    }
    System.out.println("Input end time (format xx:xx:xx)");
    String end = sc.next();
    if (!end.matches("\\d\\d:\\d\\d:\\d\\d")) {
        System.err.println("Incorrect input");
        return;
    }
    int startSec = Integer.parseInt(start.split(":")[2]);
    startSec += Integer.parseInt(start.split(":")[1]) * 60;
    startSec += Integer.parseInt(start.split(":")[0]) * 60 * 60;
    int endSec = Integer.parseInt(end.split(":")[2]);
    endSec += Integer.parseInt(end.split(":")[1]) * 60;
    endSec += Integer.parseInt(end.split(":")[0]) * 60 * 60;
    if (endSec < startSec) {
        System.err.println("Start time after the end time");
        return;
    }
    BigDecimal cost = new BigDecimal((double) (endSec - startSec) / 60 * 0.15);
    System.out.println("Phone call costs " + cost.setScale(2, RoundingMode.UP) + " UAH");
    System.out.println();
}

public static void task8() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input past time (sec)");
    int sec = sc.nextInt();
    int hours = (8 * 60 * 60 - sec) / (60 * 60);
    if (hours < 0) {
        System.out.println("GO HOME LOL!!!");
    } else if (hours == 0) {
        System.out.println("You can off your PC");
    } else {
        System.out.println(hours + " hours left");
    }
    System.out.println();
}

public static void task9() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input price of NoteBook");
    double price = sc.nextDouble();
    System.out.println("Input quantity");
    int q = sc.nextInt();
    System.out.println("Input discount");
    int disc = sc.nextInt();
    if (disc >= 100) {
        System.err.println("discount is too large");
        return;
    }
    BigDecimal cost = new BigDecimal(price * q * (100 - disc) / 100);
    System.out.println("Total cost: " + cost.setScale(2, RoundingMode.UP));
    System.out.println();
}

public static void task10() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input size of file (GB)");
    double size = sc.nextDouble();
    System.out.println("Input speed (b/sec)");
    int speed = sc.nextInt();
    long time = (long) (size * 1024 * 1024 * 1024 * 8 / speed);
    long hours = time / (60 * 60);
    long minutes = time % (60 * 60) / 60;
    long seconds = time % 60;

    if (hours > 0) {
        System.out.print(hours + " hours ");
    }
    if (minutes > 0) {
        System.out.print(minutes + " minutes ");
    }
    if (seconds > 0) {
        System.out.print(seconds + " seconds ");
    }
    System.out.println("\n");
}

public static void task11() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input size of USB-drive (GB)");
    double size = sc.nextDouble();
    System.out.println((int) (size * 1024 / 760) + " movies can be copied");
    System.out.println();
}

public static void task12() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number");
    System.out.println(new BigDecimal(sc.nextDouble()).setScale(2, RoundingMode.HALF_UP));
    System.out.println();
}

public static void task13() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input good students");
    int gstud = sc.nextInt();
    System.out.println("Input lazy students");
    int lstud = sc.nextInt();
    BigDecimal loosers = new BigDecimal((double) lstud * 100 / (gstud + lstud));
    System.out.println("Lazy students - " + loosers.setScale(2, RoundingMode.HALF_UP) + "%");
    System.out.println();
}

public static void task14() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input past time (sec)");
    int secPassed = sc.nextInt();
    int secLeft = 24 * 60 * 60 - secPassed;
    int hours = secLeft / (60 * 60);
    if (hours < 0) {
        System.out.println("Midnight passed");
        return;
    } else {
        if (hours == 0) {
            System.out.println("Midnight is coming. ");
        }
        System.out.print("Left ");
        if (hours > 0) {
            System.out.print(hours + " hours ");
        }
        int minutes = secLeft % (60 * 60) / 60;
        if (minutes > 0) {
            System.out.print(minutes + " minutes ");
        }
        int seconds = secLeft % 60;
        if (seconds > 0) {
            System.out.print(seconds + " seconds");
        }
    }
    System.out.println("\n");
}

public static void task15() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input size of movie (GB)");
    double size = sc.nextDouble();
    System.out.println("You need " + new BigDecimal(size * 1024 / 1.44).setScale(0, RoundingMode.UP) + " floppy disks");
    System.out.println();
}

public static void task16() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input sum (UAH)");
    double sum = sc.nextDouble();
    System.out.println("Input term (month)");
    int term = sc.nextInt();
    System.out.println("Input % (per year)");
    int perc = sc.nextInt();
    BigDecimal total = new BigDecimal(sum * Math.pow(1 + (double) perc / 12 / 100, term));
    System.out.println("Total amount " + total.setScale(2, RoundingMode.HALF_UP));
    System.out.println();
}

public static void task17() {
    final int radius = 6371;
    System.out.format("Surface area of the Earth - %d", (long) (4 * Math.PI * Math.pow(radius, 2)));
    System.out.println("\n");
}

public static void task18() {
    Scanner sc = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    System.out.format("Now - %td %tB %tY\n", calendar, calendar, calendar);
    System.out.println("Input days ");
    int d = sc.nextInt();
    calendar.add(Calendar.DAY_OF_MONTH, d);
    System.out.format("Now - %td %tB %tY\n", calendar, calendar, calendar);

}

public static void task19() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number of athletes");
    int athlets = sc.nextInt();
    int glass = 200;
    int pack = 900;
    int packs;
    int totalmilk = glass * athlets;
    packs = totalmilk / pack + ((totalmilk % pack > 0) ? 1 : 0);
    System.out.println("Variant a - " + packs + " packages");
    totalmilk = glass * (athlets * 6 / 10 + ((athlets * 6 % 10 > 0) ? 1 : 0));
    packs = totalmilk / pack + ((totalmilk % pack > 0) ? 1 : 0);
    System.out.println("Variant b - " + packs + " packages");

}

}
