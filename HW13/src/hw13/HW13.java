package hw13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW13 {

    public static void main(String[] args) {
        task10();
    }

    public static void myLine(int quant, char symb, boolean horizontal) {
        for (int i = 0; i < quant; i++) {
            System.out.print(horizontal ? symb : symb + "\n");
        }
    }

    public static void task1() {
        myLine(20, '@', true);
    }

    public static void myRectangle(int m, int n, String str1, String str0) {
        //int m = 30;
        //int n = 9;
        //String str1 = "*";
        //String str0 = " ";

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

    public static void task2() {
        myRectangle(30, 9, "*", " ");
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static void task3() {
        int num = 14;
        System.out.println(cube(num));
    }

    public static boolean isSimple(int num) {
        if (num == 1) {
            return true;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                return false;
            }
        }
        return true;
    }

    public static void task4() {
        int num = 22;
        System.out.println("Number is " + (isSimple(num) ? "" : "not ") + "prime");
    }

    public static int sumBetween(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }

    public static void task5() {
        int num1 = 13;
        int num2 = 18;
        System.out.println("Sum - " + sumBetween(num1, num2));
    }

    public static int arrayAvg(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum / ar.length;
    }

    public static void task6() {
        int[] ar = {1, 2, 4, 5, 7, 5, 3, 6, 87, 7};
        System.out.println("Sum - " + arrayAvg(ar));
    }

    public static int[] arrayNew(int n) {
        int ar[] = new int[n];
        return ar;
    }

    public static void arrayFill(int[] ar) {
        Random rnd = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rnd.nextInt();
        }
    }

    public static void arrayPrint(int[] ar) {
        System.out.println(Arrays.toString(ar));
    }

    public static void arraySort(int[] ar) {
        Arrays.sort(ar);
    }

    public static void arrayPut(int[] ar, int num, int index) {
        ar[index] = num;
    }

    public static void task7() {
        int n = 5;
        int[] ar = arrayNew(n);
        arrayFill(ar);
        arrayPrint(ar);
        arraySort(ar);
        arrayPut(ar, 43, n - 1);
        arrayPrint(ar);
    }

    public static void printMinMax(int[] ar) {
        int min = ar[0];
        int iMin = 0;
        int max = ar[0];
        int iMax = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
                iMin = i;
            }
            if (ar[i] > max) {
                max = ar[i];
                iMax = i;
            }
        }
        System.out.println("Min  " + min + " index - " + iMin);
        System.out.println("Max  " + max + " index - " + iMax);
    }

    public static void task8() {
        int n = 10;
        int[] ar = arrayNew(n);
        arrayFill(ar);
        System.out.println(Arrays.toString(ar));
        printMinMax(ar);
    }

    public static void reverseArray(int[] ar) {
        int temp;
        for (int i = 0; i < ar.length / 2; i++) {
            temp = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = ar[i];
            ar[i] = temp;
        }
    }

    public static void task9() {
        int n = 10;
        int[] ar = arrayNew(n);
        arrayFill(ar);
        System.out.println(Arrays.toString(ar));
        reverseArray(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static int throwCube(int q) {
        if (q < 0) {
            return 0;
        }
        int[] cubs = new int[q];
        Random rand = new Random();
        int sum = 0;
        int num;
        for (int i = 0; i < cubs.length; i++) {
            num = rand.nextInt(6);
            cubs[i] = num;
            sum += num;
        }

        String tab = "  ";
        String cubePrint[][] = new String[5][6];
        cubePrint[0][0] = " ------- ";
        cubePrint[1][0] = "|       |";
        cubePrint[2][0] = "|   *   |";
        cubePrint[3][0] = "|       |";
        cubePrint[4][0] = " ------- ";

        cubePrint[0][1] = " ------- ";
        cubePrint[1][1] = "| *     |";
        cubePrint[2][1] = "|       |";
        cubePrint[3][1] = "|     * |";
        cubePrint[4][1] = " ------- ";

        cubePrint[0][2] = " ------- ";
        cubePrint[1][2] = "| *     |";
        cubePrint[2][2] = "|   *   |";
        cubePrint[3][2] = "|     * |";
        cubePrint[4][2] = " ------- ";

        cubePrint[0][3] = " ------- ";
        cubePrint[1][3] = "| *   * |";
        cubePrint[2][3] = "|       |";
        cubePrint[3][3] = "| *   * |";
        cubePrint[4][3] = " ------- ";

        cubePrint[0][4] = " ------- ";
        cubePrint[1][4] = "| *   * |";
        cubePrint[2][4] = "|   *   |";
        cubePrint[3][4] = "| *   * |";
        cubePrint[4][4] = " ------- ";

        cubePrint[0][5] = " ------- ";
        cubePrint[1][5] = "| *   * |";
        cubePrint[2][5] = "| *   * |";
        cubePrint[3][5] = "| *   * |";
        cubePrint[4][5] = " ------- ";

        for (int row = 0; row < cubePrint.length; row++) {
            for (int c = 0; c < cubs.length; c++) {
                System.out.print(cubePrint[row][cubs[c]] + tab);
            }
            System.out.println();
        }
        return sum;
    }

    public static void task10() {
        int atempts = 10;
        int cubes = 4;
        int sumBot = 0;
        int sumPlayer = 0;
        System.out.println("Добро пожаловать в казино ЗОЛОТОЙ КЛЮЧИК");
        for (int i = 0; i < atempts; i++) {
            System.out.println("Попытка №" + (i + 1));
            System.out.println("Бросок казино: ");
            sumBot += throwCube(cubes);
            System.out.println("Ваш бросок (нажмите Enter для броска): ");
            new Scanner(System.in).nextLine();
            sumPlayer += throwCube(cubes);
            System.out.println("\n");
        }
        System.out.println("СЧЕТ ИГРЫ");
        System.out.println("Казино - " + sumBot);
        System.out.println("Вы - " + sumPlayer);

        if (sumBot > sumPlayer) {
            System.out.println("Победа КАЗИНО!!!");
        } else if (sumBot < sumPlayer) {
            System.out.println("Победа ВАША!!!");
        } else {
            System.out.println("Ничья");
        }
    }

     public static double myRound(double num, int pow) {
         for (int i = 0; i < pow; i++) {
             num*=10;
         }
         num=Math.round(num);
         for (int i = 0; i < pow; i++) {
             num/=10;
         }
         return num;
    }

    public static void task11() {
        double num = 10.4556787546;
        int pow=4;
        String outString="Num - %."+ pow +"f\n";
        System.out.format(outString,myRound(num,pow));
    }
}
