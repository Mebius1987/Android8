package hw12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW12 {

    public static void main(String[] args) {
        task9();
    }

    public static void task1() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println("Введите символ для поиска: ");
        String strIn = sc.nextLine();
        int found = 0;
        int next = 0;
        int count = 0;
        while (found >= 0) {
            found = str.indexOf(strIn, next);
            if (found >= 0) {
                System.out.println("Совпадение по индексу: " + found);
                count++;
            }
            next = found + 1;
        }
        if (count > 0) {
            System.out.println("Всего совпадений - " + count);
        } else {
            System.out.println("Нет совпадений");
        }
    }

    public static void task2() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        System.out.println("Введите строку на английском: ");
        String str = sc.nextLine();

        String pat[] = {
            ".",
            "(\\b\\w+?\\b)",
            "[aeyuioAEYUIO]",
            "[\\w&&[^aeyuioAEYUIO0-9]]",
            "\\p{Punct}",
            "[0-9]",
            "[^\\p{Alpha}\\p{Digit}\\p{Punct}]"
        };
        String msg[] = {
            "Всего символов в строке - ",
            "Слов в строке - ",
            "Гласных букв - ",
            "Согласных букв - ",
            "Знаков пунктуации - ",
            "Цифр - ",
            "Других символов - "
        };
        Pattern p;
        Matcher m;
        int count = 0;
        for (int i = 0; i < pat.length; i++) {
            p = Pattern.compile(pat[i]);
            m = p.matcher(str);
            count = 0;
            while (m.find()) {
                count++;
            }
            System.out.println(msg[i] + count);
        }
    }

    public static void task3() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        Pattern p;
        Matcher m;
        int countWord = 0;
        int countLet = 0;
        p = Pattern.compile("([а-яА-ЯёЁa-zA-Z0-9]{1,}{1,})");
        m = p.matcher(str);
        while (m.find()) {
            countLet += m.group().length();
            countWord++;
        }
        System.out.println((double) countLet / countWord);
    }

    public static void task4() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        System.out.println("Введите строку: ");
        String str = sc.nextLine().toLowerCase();
        Pattern p;
        Matcher m;
        p = Pattern.compile("([а-яА-ЯёЁa-zA-Z])");
        m = p.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            sb.append(m.group());
        }
        if (sb.toString().equals(new StringBuilder(sb).reverse().toString())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }

    public static void task5() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println("Введите слово для поиска: ");
        String strIn = sc.nextLine();
        int found = 0;
        int next = 0;
        int count = 0;
        str = str.toLowerCase();
        strIn = strIn.toLowerCase();
        while (found >= 0) {
            found = str.indexOf(strIn, next);
            if (found >= 0) {
                System.out.println("Совпадение по индексу: " + found);
                count++;
            }
            next = found + 1;
        }
        if (count > 0) {
            System.out.println("Всего совпадений - " + count);
        } else {
            System.out.println("Нет совпадений");
        }
    }

    public static void task6() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        System.out.println("Напишите письмо: ");
        String str = sc.nextLine();
        String[] spam = {"xxx", "viagra"};

        str = str.toLowerCase();
        for (int i = 0; i < spam.length; i++) {
            if (str.contains(spam[i].toLowerCase())) {
                System.out.println("Это СПАМ!");
                break;
            }
        }
    }

    public static void task7() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        Pattern p;
        Matcher m;
        p = Pattern.compile("(?<=(\\$|грн\\.?|USD|EUR)\\s?)(\\d{1,10})|(\\d{1,10})(?=\\s?(\\$|грн\\.?|USD|EUR))");
        m = p.matcher(str);
        if (m.find()) {
            String price = m.group();
            System.out.println("Цена товара - " + price);
        } else {
            System.out.println("Это не ценник");
        }
    }

    public static void task8() {
        int passlen = 10; //(int) (Math.random() * 11 + 5); // от 5 до 15 символов
        char fromChr[] = {'a', 'A', '0'};
        char toChr[] = {'z', 'Z', '9'};
        int type;
        for (int i = 1; i <= passlen; i++) {
            type = (int) (Math.random() * fromChr.length);
            System.out.print((char) (Math.random() * (toChr[type] - fromChr[type]) + fromChr[type]));
        }
        System.out.println("");
    }

    public static void task9() {
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner sc = new Scanner(System.in, encoding);
        String str[] = new String[2];
        System.out.println("Введите строку 1: ");
        str[0] = sc.nextLine().toLowerCase();
        System.out.println("Введите строку 2: ");
        str[1] = sc.nextLine().toLowerCase();
        Pattern p;
        Matcher m;
        p = Pattern.compile("([а-яА-ЯёЁa-zA-Z])");
        StringBuilder sb = new StringBuilder();
        char chrAr[];
        for (int i = 0; i < str.length; i++) {
            m = p.matcher(str[i]);
            while (m.find()) {
                sb.append(m.group());
            }
            chrAr=sb.toString().toCharArray();
            Arrays.sort(chrAr);
            str[i]=new String(chrAr);
            sb=new StringBuilder("");
        }
        
        if (str[0].equals(str[1])) {
            System.out.println("Это анаграмма");
        } else {
            System.out.println("Это не анаграмма");
        }
    }

}
