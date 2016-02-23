
import java.util.Arrays;

public class hw10 {

    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        int m = 10;
        int n = 10;
        int from = 0;
        int to = 20;
        int ar[][] = new int[m][n];
        int sum = 0;
        int max = from;
        int min = to;
        int avrg;
        int num;

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                num = (int) (Math.random() * (to + 1 - from) + from);
                ar[x][y] = num;
                sum += num;
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }
        }
        avrg = sum / (n * m);

        System.out.println("Sum - " + sum);
        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
        System.out.println("Averege - " + avrg);
    }

    public static void task2() {
        int m = 10;
        int n = m;
        int from = 0;
        int to = 20;
        int ar[][] = new int[m][n];
        int sumLR = 0;
        int sumRL = 0;
        int num;

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                num = (int) (Math.random() * (to + 1 - from) + from);
                ar[x][y] = num;
                if (x == y) {
                    sumLR += num;
                }
                if (x == n-1-y) {
                    sumRL += num;
                }
            }
        }
        System.out.println("Sum - " + sumLR);
        System.out.println("Sum - " + sumRL);
    }

}
