
import java.util.Arrays;
import java.util.Scanner;

public class hw9 {

public static void main(String[] args) {
    task17();
}

public static void task1() {
    Scanner sc = new Scanner(System.in);
    int a = 5;
    int ar[] = new int[a];
    System.out.println("Input " + a + " value(s) for array:");
    for (int i = 0; i < a; i++) {
        ar[i] = sc.nextInt();
    }
    System.out.println("Reversed array:");
    for (int i = a - 1; i >= 0; i--) {
        System.out.println(ar[i]);
    }
}

public static void task2() {
    int a = 20;
    int ar[] = new int[a];
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * 100);
    }
    for (int i = 0; i < a; i++) {
        if (i != 0 && i % 2 == 0) {
            System.out.println("ar[" + i + "]=" + ar[i]);
        }
    }
}

public static void task3() {
    int a = 10;
    int start = -20;
    int end = 20;
    int ar[] = new int[a];
    int count = 0, sum = 0;
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end - start) + start);
        if (ar[i] > 0) {
            count++;
            sum += ar[i];
        }
    }
    System.out.println("Count of positive numbers: " + count);
    System.out.println("Sum of positive numbers: " + sum);
    System.out.println("Averege positive number: " + sum / count);
}

public static void task4() {
    int a = 100;
    int start = 32;
    int end = 126;
    char ar[] = new char[a];
    int dig = 0, let = 0, dot = 0;
    for (int i = 0; i < a; i++) {
        ar[i] = (char) (Math.random() * (end + 1 - start) + start); // including
        // end
        if (ar[i] >= '0' && ar[i] <= '9') {
            dig++;
        } else if (ar[i] >= 'A' && ar[i] <= 'Z' || ar[i] >= 'a' && ar[i] <= 'z') {
            let++;
        } else {
            dot++;
        }
    }
    System.out.println("Array: " + new String(ar));
    System.out.println("Digits: " + dig);
    System.out.println("Letters: " + let);
    System.out.println("Other: " + dot);
}

public static void task5() {
    int a = 100;
    int start = 1;
    int end = 20;
    int ar[] = new int[a];
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end + 1 - start)) + start; // including
        // "end"
    }
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number (from " + start + " to " + end + "):");
    int num = sc.nextInt();
    int count = 0;
    for (int i = 0; i < a; i++) {
        if (ar[i] == num) {
            count++;
        }
    }
    System.out.println("Array: " + Arrays.toString(ar));
    System.out.println("Your number is repeated " + count + " times");
}

public static void task6() {
    int a = 20;
    int start = -10;
    int end = 30;
    int ar[] = new int[a];
    int sum = 0;
    boolean doSum = false;
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end - start) + start);
        if (doSum) {
            sum += ar[i];
        }
        if (ar[i] < 0) {
            doSum = true;
        }
    }
    System.out.println("Array: " + Arrays.toString(ar));
    System.out.println("Sum: " + sum);
}

public static void task7() {
    int a = 20;
    int start = -30;
    int end = 10;
    int ar[] = new int[a];
    int sum = 0;
    boolean doSum = true;
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end - start) + start);
        if (ar[i] > 0) {
            doSum = false;
        }
        if (doSum) {
            sum += ar[i];
        }
    }
    System.out.println("Array: " + Arrays.toString(ar));
    System.out.println("Sum: " + sum);
}

public static void task8() {
    int a = 20;
    int start = 0;
    int end = 100;
    int ar[] = new int[a];
    int max = 0, min = 0;
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end - start) + start);
        if (i == 0) {
            max = ar[i];
            min = ar[i];
        }
        if (ar[i] > max) {
            max = ar[i];
        }
        if (ar[i] < min) {
            min = ar[i];
        }
    }
    System.out.println("Array: " + Arrays.toString(ar));
    System.out.println("Max: " + max);
    System.out.println("Max: " + min);
}

public static void task9() {
    int a = 10;
    int start = 0;
    int end = 10;
    double ar[] = new double[a];
    int count = 0;
    for (int i = 0; i < a; i++) {
        ar[i] = Math.random() * (end - start) + start;
        if ((int) ar[i] == ar[i]) {
            count++;
        }
    }
    System.out.println("Integer numbers: " + count);
}

public static void task10() {
    int a = 200;
    int start = 0;
    int end = 200;
    int ar[] = new int[a];
    int dig1 = 0, dig2 = 0, dig3 = 0;
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end - start) + start);
        if (ar[i] < 10) {
            dig1++;
        } else if (ar[i] >= 10 && ar[i] < 100) {
            dig2++;
        } else if (ar[i] >= 100 && ar[i] < 1000) {
            dig3++;
        }
    }
    System.out.println("1 digit: " + dig1 * 100 / a + "%");
    System.out.println("2 digits: " + dig2 * 100 / a + "%");
    System.out.println("3 digits: " + dig3 * 100 / a + "%");
}

public static void task11() {
    int a = 10;
    int start = 0;
    int end = 10;
    int ar[] = new int[a];
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end - start) + start);
    }
    System.out.println("Array: " + Arrays.toString(ar));
    int temp;
    for (int i = 0; i < a / 2; i++) {
        temp = ar[i];
        ar[i] = ar[a - 1 - i];
        ar[a - 1 - i] = temp;
    }
    System.out.println("Array: " + Arrays.toString(ar));
}

public static void task12() {
    int a[] = {1, 3, 5, 7, 9};
    int b[] = {2, 4, 6, 8, 10};
    int c[] = new int[10];
    for (int i = 0; i < 5; i++) {
        c[i * 2] = a[i];
        c[i * 2 + 1] = b[i];
    }
    System.out.println("Array: " + Arrays.toString(c));
}

public static void task13() {
    int a = 10;
    int start = -3;
    int end = 3;
    int ar1[] = new int[a];
    int ar2[] = new int[a];
    for (int i = 0; i < a; i++) {
        ar1[i] = (int) (Math.random() * (end + 1 - start)) + start; // including
        // "end"
    }
    System.out.println("Array: " + Arrays.toString(ar1));
    int j = 0;
    for (int i = 0; i < a; i++) {
        if (ar1[i] > 0) {
            ar2[j] = ar1[i];
            j++;
        }
    }
    for (int i = 0; i < a; i++) {
        if (ar1[i] == 0) {
            ar2[j] = ar1[i];
            j++;
        }
    }
    for (int i = 0; i < a; i++) {
        if (ar1[i] < 0) {
            ar2[j] = ar1[i];
            j++;
        }
    }
    System.out.println("Array: " + Arrays.toString(ar2));
}

public static void task14() {
    int m = 10;
    int n = 14;
    int start = 0;
    int end = 10;
    int ar1[] = new int[m];
    int ar2[] = new int[n];
    for (int i = 0; i < m; i++) {
        ar1[i] = (int) (Math.random() * (end + 1 - start)) + start; // including
        // "end"
    }
    System.out.println("Array 1: " + Arrays.toString(ar1));
    for (int i = 0; i < n; i++) {
        ar2[i] = (int) (Math.random() * (end + 1 - start)) + start; // including
        // "end"
    }
    System.out.println("Array 2: " + Arrays.toString(ar2));
    int equals = 0;
    Arrays.sort(ar1);
    for (int i = 0; i < ar1.length; i++) {
        if (i > 0 && ar1[i] == ar1[i - 1]) {
            continue;
        }
        for (int j = 0; j < ar2.length; j++) {
            if (ar1[i] == ar2[j]) {
                equals++;
                break;
            }
        }
    }
    if (equals > 0) {
        int q = 0;
        int ar3[] = new int[equals];
        for (int i = 0; i < ar1.length; i++) {
            if (i > 0 && ar1[i] == ar1[i - 1]) {
                continue;
            }
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    ar3[q] = ar1[i];
                    q++;
                    break;
                }
            }
        }
        System.out.println("Array 3: " + Arrays.toString(ar3));
    } else {
        System.out.println("No match in the arrays");
    }
}

public static void task15() {
    int m = 10;
    int n = 1;
    int start = 0;
    int end = 10;
    int ar1[] = new int[m];
    int ar2[] = new int[n];
    for (int i = 0; i < m; i++) {
        ar1[i] = (int) (Math.random() * (end + 1 - start)) + start; // including
        // "end"
    }
    System.out.println("Array 1: " + Arrays.toString(ar1));
    for (int i = 0; i < n; i++) {
        ar2[i] = (int) (Math.random() * (end + 1 - start)) + start; // including
        // "end"
    }
    System.out.println("Array 2: " + Arrays.toString(ar2));
    int notequals = 0;
    boolean equal;
    Arrays.sort(ar1);
    for (int i = 0; i < ar1.length; i++) {
        equal = false;
        if (i > 0 && ar1[i] == ar1[i - 1]) {
            continue;
        }
        for (int j = 0; j < ar2.length; j++) {
            if (ar1[i] == ar2[j]) {
                equal = true;
                break;
            }
        }
        if (!equal) {
            notequals++;
        }
    }
    if (notequals > 0) {
        int q = 0;
        int ar3[] = new int[notequals];
        for (int i = 0; i < ar1.length; i++) {
            equal = false;
            if (i > 0 && ar1[i] == ar1[i - 1]) {
                continue;
            }
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    equal = true;
                    break;
                }
            }
            if (!equal) {
                ar3[q] = ar1[i];
                q++;
            }
        }
        System.out.println("Array 3: " + Arrays.toString(ar3));
    } else {
        System.out.println("Arrays have'nt unique values");
    }
}

public static void task16() {
    int count = 5;
    int from = 1;
    int to = 42;
    final int range = to + 1 - from; // +1 - including end
    int rangeAr[] = new int[range];
    int bingoAr[] = new int[count];
    Arrays.fill(bingoAr, from);
    for (int i = 0; i < range; i++) {
        rangeAr[i] = from + i;
    }
    int rand, a = 0;
    while (a < count) {
        rand = (int) (Math.random() * range);
        if (rangeAr[rand] >= from) {
            bingoAr[a] = rangeAr[rand];
            rangeAr[rand] = from - 1;
            a++;
        }
    }

    int userAr[] = new int[count];
    Scanner sc = new Scanner(System.in);
    System.out.println("Input " + count + " numbers from " + from + " to " + to);
    for (int i = 0; i < count; i++) {
        userAr[i] = sc.nextInt();
    }

    int bingo = 2;
    for (int i = 0; i < count; i++) {
        for (int j = 0; j < count; j++) {
            if (userAr[i] == bingoAr[j]) {
                bingo++;
                break;
            }
        }
    }

    long chance = 1;
    long chance2 = 1;

    if (bingo == 0) {
        System.out.println("You do not guess any number");
    } else {
        for (int i = 0; i < bingo; i++) {
            chance = chance * (range - i);
            chance2 = chance2 * (bingo - i);
        }
        System.out.println("You guessed " + bingo + " number(s). Well done.");
        System.out.println("Chance that it could happen - " + (chance / chance2));
    }

}

public static void task17() {
    int a = 20;
    int start = -10;
    int end = 20;
    int ar[] = new int[a];
    int count=0;
    int posEnd =0;
    int len =0;
    for (int i = 0; i < a; i++) {
        ar[i] = (int) (Math.random() * (end - start) + start);
        if (ar[i] > 0 ) {
            count++;
        }
        if (i>=a || ar[i]<=0 && i>0) {
            if (count>len) {
                len=count;
                posEnd=i;
            }
            count=0;
        }
    }
    
    System.out.println("Array: " + Arrays.toString(ar));
    System.out.println("Part: " + Arrays.toString(Arrays.copyOfRange(ar, posEnd-len, posEnd)));
}

}
