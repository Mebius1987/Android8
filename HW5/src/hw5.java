
import java.util.Scanner;
import javax.swing.JOptionPane;

public class hw5 {

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
}

public static void task1() {
    System.out.println("Task 1");
    Scanner sc = new Scanner(System.in);
    System.out.println("Input coordinates of the point A (x first, y second)");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    System.out.println("Input coordinates of the point B (x first, y second)");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    if (x1 == x2 && y1 == y2) {
        System.out.println("It's same point");
    } else if (x1 == x2) {
        System.out.println("The line parallel to the ordinate axis");
    } else if (y1 == y2) {
        System.out.println("The line parallel to the abscissas axis");
    }
}

public static void task2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 2");
    System.out.println("Input number");
    double n = sc.nextDouble();
    System.out.println("This number " + (((int) n < n) ? "has " : "has no ") + "real part");
}

public static void task3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 3");
    System.out.println("Input number (day of the week)");
    int day = sc.nextInt();
    String dayStr;
    switch (day) {
        case 1:
            dayStr = "Monday";
            break;
        case 2:
            dayStr = "Tuesday";
            break;
        case 3:
            dayStr = "Wednesday";
            break;
        case 4:
            dayStr = "Thursday";
            break;
        case 5:
            dayStr = "Friday";
            break;
        case 6:
            dayStr = "Saturday";
            break;
        case 7:
            dayStr = "Sunday";
            break;
        default:
            dayStr = day + "thday";
    }
    System.out.println(dayStr);
}

public static void task4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 4");
    System.out.println("Input time (h:m:s)");
    String time = sc.next();
    if (time.matches("\\d+:\\d\\d:\\d\\d")) {
        int h = Integer.parseInt(time.split(":")[0]);
        int m = Integer.parseInt(time.split(":")[1]);
        int s = Integer.parseInt(time.split(":")[2]);
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            System.out.println("OK");
        } else {
            System.err.println("Incorrect input");
        }
    } else {
        System.err.println("Incorrect input");
    }
}

public static void task5() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 5");
    System.out.println("Input number (6 digits)");
    String numStr = sc.next();
    if (numStr.matches("\\d{6}")) {
        int num = Integer.parseInt(numStr);
        int a = num / 1000;
        int b = num % 1000;
        a = a / 100 + a / 10 % 10 + a % 10;
        a = a / 10 + a % 10;
        b = b / 100 + b / 10 % 10 + b % 10;
        b = b / 10 + b % 10;
        if (a == b) {
            System.out.println("You're a lucky!");
        } else {
            System.out.println("You're a loser");
        }
    } else {
        System.err.println("Incorrect input");
    }
}

public static void task6() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 6");
    int retMAge = 60;
    int retFAge = 55;
    System.out.println("Input age");
    int age = sc.nextInt();
    System.out.println("Input sex of the person (Male or Female)");
    String sex = sc.next();
    if (sex.equalsIgnoreCase("Male")) {
        System.out.println(age >= retMAge ? "You've got to retire." : "You early retirement");
    } else if (sex.equalsIgnoreCase("Female")) {
        System.out.println(age >= retFAge ? "You've got to retire." : "You early retirement");
    } else {
        System.err.println("Unknown sex");
    }
}

public static void task7() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 7");
    System.out.println("Input time");
    String strtime = sc.next();
    if (strtime.matches("\\d+:[0-5][0-9]")) {
        int h = Integer.parseInt(strtime.split(":")[0]);
        if (h >= 24) {
            System.err.println("Too much hours");
        } else if (h >= 22 || h <= 5) {
            System.out.println("Good night");
        } else if (h >= 6 && h <= 10) {
            System.out.println("Good morning");
        } else if (h >= 11 && h <= 17) {
            System.out.println("Good day");
        } else if (h >= 18 && h <= 21) {
            System.out.println("Good evening");
        }
    } else {
        System.err.println("Incorrect input");
    }
}

public static void task8() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 8");
    System.out.println("Input height (cm)");
    int h = sc.nextInt();
    System.out.println("Input weight (rg)");
    int w = sc.nextInt();
    int iW = h - 110;
    if (iW == w) {
        System.out.println("You have an ideal weight");
    } else {
        System.out.println("You need to " + (iW > w ? "gain" : "lose") + " weight at " + (Math.abs(w - iW)) + " kg");
    }
}

public static void task9() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 9");
    System.out.println("Input year");
    int y = sc.nextInt();
    if (y < 0) {
        System.err.println("Incorrect year");
        return;
    }
    boolean yVesokos = ((y % 4) == 0 && (y % 100) != 0)
            || (y % 400) == 0;
    System.out.println("Input month");
    int m = sc.nextInt();
    if (m < 1 || m > 12) {
        System.err.println("Incorrect month");
        return;
    }
    System.out.println("Input day");
    int d = sc.nextInt();
    if (d < 1 || d > 31
            || (m == 2 && yVesokos && d > 29)
            || (m == 2 && !yVesokos && d > 28)
            || (d == 31 && (m == 4 || m == 6 || m == 9 || m == 11))) {
        System.err.println("Incorrect day");
        return;
    }
    d++;
    if (d == 32
            || (m == 2 && yVesokos && d == 30)
            || (m == 2 && !yVesokos && d == 29)
            || d == 31 && (m == 4 || m == 6 || m == 9 || m == 11)) {
        d = 1;
        m++;
    }
    if (m == 13) {
        y++;
        m = 1;
    }
    System.out.format("Next day - %02d.%02d.%d%n", d, m, y);
}

public static void task10() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 10");
    String anymals[] = {"dog",
        "cat",
        "mouse",
        "hen",
        "cow",
        "goose",
        "turkey",
        "pig",
        "big pig",
        "drunk plumber"};
    String sounds[] = {"woof woof",
        "meow meow",
        "pi pi pi",
        "ko ko ko",
        "mooooo",
        "ga ga ga",
        "bla bla bla",
        "hru hru",
        "HRU HRU",
        "#@$$#@!#$@!"};
    System.out.println("Choose anymal:");
    int i = 1;
    for (String anymal : anymals) {
        System.out.println(i++ + " - " + anymal);
    }
    int iAnymal = sc.nextInt();
    if (iAnymal < 1 && iAnymal > anymals.length) {
        System.err.println("Incorrect input");
    } else {
        iAnymal--;
        System.out.println(anymals[iAnymal] + " says \"" + sounds[iAnymal] + "\"");
    }
}

public static void task11() {
    String questions[] = {"Юппи - просто добавь ...",
        "Скупой платит ...",
        "Кто ходит по цепи кругом?",
        "На какой цвет светофора можно переходить дорогу?",
        "Царь зверей - это ..."};
    String answers[][] = {{"Воды", "Руды", "Слюды", "Бензоала натрия"},
    {"В долларах", "Наличкой", "Не отходя от кассы", "Дважды"},
    {"Профессор", "Кот ученый", "Заключенный", "Голуби"},
    {"Зеленый", "Красный", "Синий", "Желтый"},
    {"Джулиан", "Лев", "Зверев", "Императорский пингвин"}};
    int answer[] = {1,
        4,
        2,
        1,
        2};
    for (int i = 0; i < questions.length; i++) {
        int response = JOptionPane.showOptionDialog(null, questions[i],
                "Вопрос на " + ((i + 1) * 1000) + " гривен",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                answers[i], null);
        if (response < 0) {
            JOptionPane.showMessageDialog(null,
                    "Жаль что вы решили не продолжать игру. \nВаш выигрыш - " + (i * 1000) + " гривен",
                    "ДАВАЙДОСВИДАНИЯ!",
                    JOptionPane.PLAIN_MESSAGE);
            break;
        } else if ((response + 1) == answer[i]) {
            JOptionPane.showMessageDialog(null,
                    "Вы верно ответили на вопрос.\nВаш выигрыш - " + ((i + 1) * 1000) + " гривен",
                    "ПОЗДРАВЛЯЕМ!",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Вы неверно ответили на вопрос.\nК сожалению мы с вамми прощаемся.\nВаш выигрыш - " + ((i - i % 3) * 1000) + " гривен",
                    "ДАВАЙДОСВИДАНИЯ!",
                    JOptionPane.PLAIN_MESSAGE);
            break;
        }
    }
    JOptionPane.showMessageDialog(null,
            "Вы гений.\nВаш мозг заработал вам - " + (questions.length * 1000) + " гривен",
            "ПОЗДРАВЛЯЕМ!",
            JOptionPane.PLAIN_MESSAGE);
}

public static void task12() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 12");
    String temp[] = {"-10 .. 0", "0 .. +12", "+12 .. +25", "+25 .. +35", "+35 .. +45"};
    String tempStr[] = {"very cold", "cold", "warm", "heat", "very heat"};
    String fallout[] = {"rain", "fog", "fair", "snow", "hail"};
    System.out.println("Input temperature:");
    int t = sc.nextInt();
    System.out.print("Now is ");
    if (t < 0) {
        System.out.println(tempStr[0]);
    } else if (t >= 0 && t <= 12) {
        System.out.println(tempStr[1]);
    } else if (t > 12 && t <= 25) {
        System.out.println(tempStr[2]);
    } else if (t > 25 && t <= 35) {
        System.out.println(tempStr[3]);
    } else if (t > 35) {
        System.out.println(tempStr[4]);
    }
    int i = (int) (Math.random() * 5);
    System.out.println("Tomorrow wil be " + tempStr[i]);
    System.out.println("Temperature: " + temp[i]);
    i = (int) (Math.random() * 20);
    System.out.println("Wind: " + i + " m/s");
    i = (int) (Math.random() * 5);
    System.out.println("Fallouts: " + fallout[i]);
    i = (int) (Math.random() * 22);
    System.out.println("Temperature of sea water: +" + i);
}

public static void task13() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 13");
    System.out.println("Ask your question");
    String s = sc.nextLine();
    String answer[] = {"Yes", "Surely", "Spirits say yes", "The chance is great", "I think no",
        "I think no", "No", "Spirits say no", "You have no chance", "Absolutely not",
        "Ask again", "Not now", "Ask later", "Have doubts", "Perhaps",
        "May be", "Better not tell you now", "Concentrate and ask again", " Cannot predict now", "Pphhhh"};
    int i = (int) (Math.random() * 20);
    System.out.println(answer[i]);
}

public static void task14() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 14");
    int aNum = 5; // amount of numbers
    int from = 1; // > 0
    int to = 10;
    int nums[] = new int[aNum]; // numbers
    int unums[] = new int[aNum]; // user numbers
    int num;
    boolean newnum;
    System.out.println("Input 5 numbers from " + from + " to " + to);
    for (int i = 0; i < aNum; i++) {
        do {
            newnum = true;
            num = sc.nextInt();
            if (num < from || num > to) {
                System.out.println("Incorrect number. Try again");
                newnum = false;
            } else {
                for (int n : unums) {
                    if (n == num) {
                        System.out.println("This number already inputed. Try again.");
                        newnum = false;
                    }
                }
            }
        } while (!newnum);
        unums[i] = num;
    }
    System.out.println("Start lottery!");
    for (int i = 0; i < aNum; i++) {
        do {
            newnum = true;
            num = (int) (Math.random() * (to - from) + from);
            for (int n : nums) {
                if (n == num) {
                    newnum = false;
                }
            }
        } while (!newnum);
        nums[i] = num;
        System.out.println(num);
    }

    int bingo = 0;
    for (int n : unums) {
        for (int m : nums) {
            if (m == n) {
                bingo++;
            }
        }
    }
    if (bingo > 0) {
        System.out.println("You guessed " + bingo + " numbers");
        System.out.print("The probability of this event 1 of ");
        long prob = 1;
        for (int i = 0; i < bingo; i++) {
            prob *= (to - i);
        }
        for (int i = 0; i < bingo; i++) {
            prob /= (bingo - i);
        }
        System.out.println(prob);
    } else {
        System.out.println("You guessed nothing");
    }
    int bonus;
    if (bingo > 2) {
        bonus = (int) (bingo * Math.pow(10, bingo - 1));
        System.out.println("You win " + bonus + " UAH");
    }
}

public static void task15() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 15");
    int m;
    System.out.println("Input month of your birth");
    do {
        m = sc.nextInt();
        if (m < 1 || m > 12) {
            System.out.println("Incorrect input. Try again");
        }
    } while (m < 1 || m > 12);
    int d;
    boolean incorrectDay;
    System.out.println("Input day of your birth");
    do {
        d = sc.nextInt();
        incorrectDay = d < 1 || d > 31
                || (m == 2 && d > 29)
                || (d == 31 && (m == 4 || m == 6 || m == 9 || m == 11));
        if (incorrectDay) {
            System.out.println("Incorrect input. Try again");
        }
    } while (incorrectDay);
    String zodiac = "";
    if ((m == 3 && d >= 21) || (m == 4 && d <= 19)) {
        zodiac = "Aries";
    } else if ((m == 4 && d >= 20) || (m == 5 && d <= 20)) {
        zodiac = "Taurus";
    } else if ((m == 5 && d >= 21) || (m == 6 && d <= 20)) {
        zodiac = "Gemini";
    } else if ((m == 6 && d >= 21) || (m == 7 && d <= 22)) {
        zodiac = "Cancer";
    } else if ((m == 7 && d >= 23) || (m == 8 && d <= 22)) {
        zodiac = "Leo";
    } else if ((m == 8 && d >= 23) || (m == 9 && d <= 22)) {
        zodiac = "Virgo";
    } else if ((m == 9 && d >= 23) || (m == 10 && d <= 22)) {
        zodiac = "Libra";
    } else if ((m == 10 && d >= 23) || (m == 11 && d <= 21)) {
        zodiac = "Scorpius";
    } else if ((m == 11 && d >= 22) || (m == 12 && d <= 21)) {
        zodiac = "Sagittarius";
    } else if ((m == 12 && d >= 22) || (m == 1 && d <= 19)) {
        zodiac = "Capricornus";
    } else if ((m == 1 && d >= 20) || (m == 2 && d <= 18)) {
        zodiac = "Aquarius";
    } else if ((m == 2 && d >= 19) || (m == 3 && d <= 20)) {
        zodiac = "Pisces";
    }
    System.out.println(zodiac);
    System.out.println("Your next week will be " + (((int) (Math.random() * 2)) == 1 ? "awesome" : "crappy"));
}

public static void task16() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 16");
    int chicks = 5;
    double chickPrice = 22.50;
    int chickEggs = 6; // per week
    double eggPrice = 15.50; // per 10

    System.out.println("Buisness plan");
    double inv = chicks * chickPrice;
    System.out.format("Investments - %.2f%n", inv);
    double inc = chicks * chickEggs / 7 * eggPrice / 10;
    System.out.format("Income per day - %.2f%n", inc);
    int ret = (int) Math.ceil(inv / inc);
    System.out.format("Investments return in %d days%n", ret);
}

public static void task17() {
    System.out.println("Task 17");
    int credit = 5000;
    int bet = 50;
    int a, b, c;
    int bonus;
    int response;
    String buttons[] = {"Play again", "Exit"};
    do {
        if (credit < bet) {
            JOptionPane.showMessageDialog(null, "You loose",
                    "GAME OVER",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        a = (int) (Math.random() * 8);
        b = (int) (Math.random() * 8);
        c = (int) (Math.random() * 8);
        credit -= bet;
        bonus = 0;
        if (a == 0 && b == 0 && c == 0) {
            bonus = bet * 20;
        } else if (a == 1 && b == 1 && c == 1) {
            bonus = bet * 20;
        } else if (a == 2 && b == 2 && c == 2) {
            bonus = bet * 20;
        } else if (a == 3 && b == 3 && c == 3) {
            bonus = bet * 20;
        } else if (a == 4 && b == 4 && c == 4) {
            bonus = bet * 20;
        } else if (a == 5 && b == 5 && c == 5) {
            bonus = bet * 50;
        } else if (a == 5 && b == 5) {
            bonus = bet * 30;
        } else if (a == 5) {
            bonus = bet * 10;
        } else if (a == 6 && b == 6 && c == 6) {
            bonus = -bet * 50;
        } else if (a == 7 && b == 7 && c == 7) {
            JOptionPane.showMessageDialog(null, "You WIN",
                    "WIN!!!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else if (a == 7 && b == 7) {
            bonus = bet * 100;
        } else if (a == 7) {
            bonus = bet * 30;
        }
        credit += bonus;
        response = JOptionPane.showOptionDialog(null, "      " + a + "   " + b + "   " + c
                + "\nWin: " + bonus
                + "\nBalance: " + credit,
                "Let's play",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                buttons, null);
        if (response == 1) {
            return;
        }
    } while (true);
}
}
