
import java.util.Arrays;

public class hw10 {

    public static void main(String[] args) {
        task8();
    }

    public static void task1() {
        int rows = 10;
        int colmns = 10;
        int from = 0;
        int to = 20;
        int ar[][] = new int[rows][colmns];
        int sum = 0;
        int max = from;
        int min = to;
        int avrg;
        int num;

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                num = (int) (Math.random() * (to + 1 - from) + from);
                ar[y][x] = num;
                sum += num;
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }
        }
        avrg = sum / (colmns * rows);

        System.out.println("Sum - " + sum);
        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
        System.out.println("Averege - " + avrg);
    }

    public static void task2() {
        int rows = 10;
        int colmns = rows;
        int from = 0;
        int to = 20;
        int ar[][] = new int[rows][colmns];
        int sumLR = 0;
        int sumRL = 0;
        int num;

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                num = (int) (Math.random() * (to + 1 - from) + from);
                ar[y][x] = num;
                if (x == y) {
                    sumLR += num;
                }
                if (y == rows - 1 - x) {
                    sumRL += num;
                }
            }
        }
        System.out.println("Sum - " + sumLR);
        System.out.println("Sum - " + sumRL);
    }

    public static void task3() {
        int rows = 10;
        int colmns = 10;
        int from = -10;
        int to = 10;
        int ar[][] = new int[rows][colmns];
        int countP = 0;
        int countN = 0;
        int countZero = 0;
        int num;

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                num = (int) (Math.random() * (to + 1 - from) + from);
                ar[y][x] = num;
                if (num > 0) {
                    countP++;
                }
                if (num < 0) {
                    countN++;
                }
                if (num == 0) {
                    countZero++;
                }
            }
        }
        System.out.println("Count of positives - " + countP);
        System.out.println("Count of negatives - " + countN);
        System.out.println("Count of zeroes - " + countZero);
    }

    public static void task4() {
        int rows = 10;
        int colmns = 10;
        int from = 0;
        int to = 20;
        int ar[][] = new int[rows][colmns];
        int sumRow[] = new int[rows];
        int sumColumn[] = new int[colmns];
        int num = 0;

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                num = (int) (Math.random() * (to + 1 - from) + from);
                ar[y][x] = num;
                sumRow[y] += num;
                sumColumn[x] += num;
            }
        }
        System.out.println(Arrays.deepToString(ar));
        System.out.println(Arrays.toString(sumRow));
        System.out.println(Arrays.toString(sumColumn));
    }

    public static void task5() {
        int rows = 9;
        int colmns = 9;
        int ar[][] = new int[rows][colmns];
        int num = 0;

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                num = (y + 1) * 10 + x + 1;
                ar[y][x] = num;
            }
        }
        System.out.println(Arrays.deepToString(ar));
    }

    public static void task6() {
        int rows = 10;
        int colmns = 10;
        int ar[][] = new int[rows][colmns];
        int num = 0;
        int ar1[][];
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                num = y;
                ar[y][x] = num;
            }
        }
        ar1 = ar.clone();
        System.out.println(Arrays.deepToString(ar1));
        for (int i = 0; i < rows; i++) {
            if (i > 0 && i % 2 == 1) {
                ar[i - 1] = ar1[i];
                ar[i] = ar1[i - 1];
            }
        }
        System.out.println(Arrays.deepToString(ar));
    }

    public static void task7() {
        int rows = 10;
        int colmns = 10;
        int from = -100;
        int to = 100;
        int ar[][] = new int[rows][colmns];
        int num = 0;
        int sum = 0;
        int max = from;
        int min = to;
        int count = 0;
        int maxPos = 0;
        int minPos = 0;
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                num = (int) (Math.random() * (to + 1 - from) + from);
                ar[y][x] = num;
                if (num > max) {
                    max = num;
                    maxPos = count;
                }
                if (num < min) {
                    min = num;
                    minPos = count;
                }
                count++;
            }
        }
        count = 0;
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < colmns; x++) {
                if (count > Math.min(maxPos, minPos) && count < Math.max(maxPos, minPos)) {
                    sum += ar[y][x];
                }
                count++;
            }
        }
        System.out.println(Arrays.deepToString(ar));
        System.out.println("Sum - " + sum);
    }

    public static void task8() {
        int rows = 5;
        int colmns = rows;
        int ar[][] = new int[rows][colmns];
        int step = 1;
        int x = (colmns - 1) / 2;
        int y = rows / 2;
        int dirX = 1;
        int dirY = -1;
        String axis = "x";
        int count = 1;
        int i = 0;

        while (count <= rows * colmns) {
            ar[y][x] = count;
            System.out.println("Count - " + count + " x-" + x + " y-" + y + " i-"+i);
            if (axis == "x") {
                if (i<step) {x+=dirX;} else {axis="y";i=0;dirX*=-1;}
            }
            if (axis == "y") {
                if (i<step) {y+=dirY;} else {axis="x";i=0;dirY*=-1;step++;}
            }
            i++;
            count++;
        }
        System.out.println(Arrays.deepToString(ar));
    }

}
