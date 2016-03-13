package hw12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW12 {

    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        Pattern p;
        Matcher m;
        int countWord = 0;
        int countLet = 0;
        p = Pattern.compile("([а-яА-ЯёЁa-zA-Z0-9]{1,}{1,})",Pattern.UNICODE_CHARACTER_CLASS);
        m = p.matcher(str);
        while (m.find()) {
            countLet += m.group().length();
            countWord++;
        }
        System.out.println(countLet / countWord);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine().toLowerCase();
        Pattern p;
        Matcher m;
        p = Pattern.compile("(\\w)");
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

}
