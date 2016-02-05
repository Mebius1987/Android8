
import java.math.BigInteger;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class hw6 {

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
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 1");
    System.out.println("Input string");
    String str = sc.next();
    System.out.println("Input amount");
    int amount = sc.nextInt();
    for (int i = 1; i <= amount; i++) {
        System.out.print(str);
    }
    System.out.println();
}

public static void task2() {
    System.out.println("Task 2");
    int start = 1;
    int end = 100;
    for (int i = start; i <= end; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
}

public static void task3() {
    System.out.println("Task 3");
    int m = 67;
    int n = 100;
    int sum = 0;
    for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
        sum += i;
    }
    System.out.println(sum);
}

public static void task4() {
    System.out.println("Task 4");
    int start = 67;
    int end = 100;
    System.out.println("C\tF");
    for (int i = start; i <= end; i++) {
        System.out.println(i + "\t" + (int) (i * 1.8 + 32));
    }
}

public static void task5() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 5");
    System.out.println("Input number");
    int n = sc.nextInt();
    BigInteger f = new BigInteger("1");
    for (int i = 1; i <= n; i++) {
        f = f.multiply(new BigInteger(i + ""));
    }
    System.out.println(f);
}

public static void task6() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 6");
    System.out.println("Input integer");
    String strNum = sc.next();
    if (!strNum.matches("\\d+")) {
        System.err.println("Incorrect input");
        return;
    }
    char[] chrNum = strNum.toCharArray();
    int sum = 0;
    for (int i = 0; i < chrNum.length; i++) {
        sum += Integer.parseInt(chrNum[i] + "");
    }
    System.out.println(sum);
}

public static void task7() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 7");
    System.out.println("Input integer");
    String strNum = sc.next();
    if (!strNum.matches("\\d+")) {
        System.err.println("Incorrect input");
        return;
    }
    StringBuilder sb = new StringBuilder(strNum);
    sb = sb.reverse();
    System.out.println(sb);
}

public static void task8() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 8");
    System.out.println("Input integer");
    int num = sc.nextInt();
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            System.out.print(i + (i == num ? ".\n" : ","));
        }
    }
}

public static void task9() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 9");
    System.out.println("Input integer");
    int num = sc.nextInt();
    if (num == 1) {
        System.out.println(num + " - prime number");
        return;
    }
    for (int i = 2; i <= num; i++) {
        if (num % i == 0 && i != num) {
            System.out.println(num + " - not prime number. Devide by - " + i);
            return;
        }
    }
    System.out.println(num + " - prime number");
}

public static void task10() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 10");
    System.out.println("Input integer (2 or more digits)");
    String strNum = sc.next();
    if (!strNum.matches("\\d+") || strNum.length() < 2) {
        System.err.println("Incorrect input");
        return;
    }
    char[] chrNum = strNum.toCharArray();
    for (int i = 0; i < chrNum.length - 1; i++) {
        if (chrNum[i] == chrNum[i + 1]) {
            System.out.println("This number has the same consecutive numbers");
            return;
        }
    }
    System.out.println("This number does not have the same numbers consecutive");
}

public static void task11() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 11");
    System.out.println("Input integer (2 or more digits)");
    String strNum = sc.next();
    if (!strNum.matches("\\d+") || strNum.length() < 2) {
        System.err.println("Incorrect input");
        return;
    }
    char[] chrNum = strNum.toCharArray();
    for (int i = 0; i < chrNum.length - 1; i++) {
        if (chrNum[i] > chrNum[i + 1]) {
            System.err.println("Bad");
            return;
        }
    }
    System.out.println("Ok");
}

public static void task12() {
    int from = 0;
    int to = 1000;
    String[] answers = {"Мое число больше", "Мое число меньше", "ВАХ ШАЙТАН, это мое число!"};
    int number;
    String title = "U.G.A.D.A.Y.: number of the apocalypse";
    int response;
    int step = 0;
    JOptionPane.showMessageDialog(null,
            "Загадайте число от " + from + " до " + to,
            title,
            JOptionPane.PLAIN_MESSAGE);
    to++; // механизм поиска не включает верхнюю границу диапазона, поэтому увеличиваем ее на 1 
    do {
        step++;
        number = (to - from) / 2 + from;
        response = JOptionPane.showOptionDialog(null, "Попытка №" + step + "\nВы загадали " + number + " ?" + "\nЯ угадал число?",
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, answers, null);
        if (response < 0) {
            JOptionPane.showMessageDialog(null,
                    "Жаль что вы решили не продолжать игру. \nЭто всего лишь " + step + " попытка",
                    "ДАВАЙДОСВИДАНИЯ!",
                    JOptionPane.PLAIN_MESSAGE);
            break;
        } else if (response == 0) {
            from = number;
        } else if (response == 1) {
            to = number;
        } else if (response == 2) {
            JOptionPane.showMessageDialog(null,
                    "Я так и знал что это " + number,
                    "BINGOOOO!!!",
                    JOptionPane.PLAIN_MESSAGE);
        }
        if (response != 2 && from == to) {
            JOptionPane.showMessageDialog(null,
                    "Где-то ты сжулил. Попробуй поиграть сначала",
                    "",
                    JOptionPane.PLAIN_MESSAGE);
            return;
        }
    } while (response != 2);
}

public static void task13() {
    System.out.println("Task 13");
    int a, b;
    int luck = 0;
    for (int i = 0; i <= 999999; i++) {
        a = i / 1000;
        b = i % 1000;
        a = a / 100 + a / 10 % 10 + a % 10;
        if (a > 9) {
            a = a / 10 + a % 10;
        }
        b = b / 100 + b / 10 % 10 + b % 10;
        if (b > 9) {
            b = b / 10 + b % 10;
        }
        if (a == b) {
            luck++;
            System.out.format("Lucky №%06d%n", i);
        }
    }
    System.out.println("Lucky numbers - " + luck);
}

public static void task14() {
    System.out.println("Task 14");
    int finded = 0;
    for (int i = 12345000; i <= 98765432; i += 12345) {
        String str = String.valueOf(i);
        boolean find = !str.matches(".*(.).*\\1.*");
        if (find) {
            finded++;
            System.out.println(i);
        }
    }
    System.out.println("Finded numbers - " + finded);
}

public static void task15() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 15");
    System.out.println("Input integer");
    int num = sc.nextInt();
    System.out.println("In bin - " + Integer.toString(num, 2));
    System.out.format("In oct - %o%n", num);
    System.out.format("In hex - %x%n", num);
}

public static void task16() {
    System.out.println("Task 16");
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

public static void task17() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Task 17");
    System.out.println("Input dragon HP");
    int dragonMaxHP = sc.nextInt();
    System.out.println("Input dragon STR");
    int dragonSTR = sc.nextInt();
    System.out.println("Input knight HP");
    int knightMaxHP = sc.nextInt();
    System.out.println("Input knight STR");
    int knightSTR = sc.nextInt();
    boolean dragonDie = false;
    int knightsMaxCount = 0;
    int knightsCount;
    int dragonHP;
    int knightsHP;
    int knightsDamage;
    do {
        knightsMaxCount++;
        dragonHP = dragonMaxHP;
        knightsHP = knightMaxHP * knightsMaxCount;
        knightsCount = knightsMaxCount;
        System.out.println(knightsMaxCount + " knight(s) trying to kill a dragon");
        do {

            knightsDamage = knightsCount * knightSTR;
            System.out.print(knightsCount + " knight(s) attack a dragon (" + knightsDamage + " damage) - ");
            dragonHP -= knightsDamage;
            if (dragonHP > 0) {
                System.out.println("dragon left " + dragonHP + " health point(s)");
            } else {
                System.out.println("dragon die");
                dragonDie = true;
                break;
            }

            System.out.print("Dragon attack a knight(s) (" + dragonSTR + " damage) - ");
            knightsHP -= dragonSTR;
            if (knightsHP > 0) {
                knightsCount = knightsHP / knightMaxHP + (knightsHP % knightMaxHP > 0 ? 1 : 0);
                System.out.print(knightsCount + " knight(s) left");
                if (knightsHP % knightMaxHP > 0) {
                    System.out.println(", one of which wounded (left " + knightsHP % knightMaxHP + " health point(s))");
                } else {
                    System.out.println();
                }
            } else {
                System.out.println("all knights die");
                break;
            }

        } while (dragonHP > 0 && knightsHP > 0);

    } while (!dragonDie);

    System.out.println(knightsMaxCount + " knight(s) enough to kill the dragon");
}
}
