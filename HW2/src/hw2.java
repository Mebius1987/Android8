
import java.util.Scanner;
import java.math.BigDecimal;

public class hw2 {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Task 1
    System.out.println("Input number a(3 digits):");
    int a = in.nextInt();
    System.out.println("Input number b(3 digits):");
    int b = in.nextInt();
    // 1
    String s1 = "" + a;
    String s2 = "" + b;
    System.out.println("a=" + s1.charAt(0) + s2.charAt(1) + s1.charAt(2));
    System.out.println("b=" + s2.charAt(0) + s1.charAt(1) + s2.charAt(2));
    //2
    System.out.println("a=" + a / 100 + b / 10 % 10 + a % 10);
    System.out.println("b=" + b / 100 + a / 10 % 10 + b % 10);
    System.out.println();

    //Task 2
    System.out.println("Input number (4 digits):");
    a = in.nextInt();
    System.out.println("sum(d1+d3)=" + (a / 1000 + a / 10 % 10));
    System.out.println("diff(d2-d4)=" + (a / 100 % 10 - a % 10));
    System.out.println();

    //Task 3
    System.out.println("Input number (3 digits):");
    a = in.nextInt();
    System.out.println(a / 100 * 10 + a % 10);
    System.out.println();

    //Task 4
    System.out.println("Input sum:");
    double c = in.nextDouble();
    System.out.println("Input %/year:");
    double d = in.nextDouble();
    System.out.format("Percent per month - %.2f%n", (c * d / 100 / 12));
    System.out.println();

    //Task 5
    System.out.println("Input price:");
    c = in.nextDouble();
    System.out.println("Input money:");
    d = in.nextDouble();
    System.out.println("You can buy " + (int) (d / c) + " items.");
    System.out.format("Money left - %.2f%n", d - (int) (d / c) * c);
    System.out.println();

    //Task 6
    final double pound_k = 405.9;
    System.out.println("Input pounds:");
    c = in.nextDouble();
    System.out.println(c + " pounds = " + pound_k / 1000 * c + " kg");
    System.out.println("Input kg:");
    d = in.nextDouble();
    System.out.println(d + " kg = " + d / (pound_k / 1000) + " pounds");
    System.out.println();

    //Task 7
    System.out.println("Input length:");
    double len = in.nextDouble();
    System.out.println("Input width:");
    double wid = in.nextDouble();
    System.out.println("Input height:");
    double hei = in.nextDouble();

    double lPerM2 = 2;
    double notWall = 23;
    double paintPrice = 4;

    System.out.println("You need " + 2 * (len + wid) * hei + " liters of paint to paint this room.");
    System.out.println("It will cost " + 2 * (len + wid) * hei * paintPrice + " UAH");
    System.out.println();

    //Task 8
    // 1 (if last digit is 0, then we lost it, but result is reflected int)
    System.out.println("Input number(3 digits):");
    a = in.nextInt();
    b = 0;
    while (a > 0) {
        b = b * 10 + a % 10;
        a /= 10;
    }
    System.out.println(b);
    //2 (if last digit is 0, then we save it, but result is reflected string)
    System.out.println("Input number(3 digits):");
    a = in.nextInt();
    s1 = "" + a;
    StringBuffer sb = new StringBuffer(s1);
    s1 = sb.reverse().toString();
    System.out.println(s1);
    System.out.println();

    //Task 9
    System.out.println("Input number(5 digits):");
    a = in.nextInt();
    b = a;
    int j = 0;
    while (b > 0) {
        b /= 10;
        j++;
    }
    for (int i = 1; i <= 2; i++) {
        a = a % 10 * (int) Math.pow(10, j - 1) + a / 10;
    }
    System.out.println(a);
    System.out.println();

    //Task 10
    String[] pNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    double[] pWeight = {0.0543, 0.8136, 1, 0.1069, 318.35, 95.3, 14.54, 17.2, 0.033};

    double allW = pWeight[0] + pWeight[1] + pWeight[2] + pWeight[3] + pWeight[4] + pWeight[5] + pWeight[6] + pWeight[7] + pWeight[8];
    BigDecimal bd = new BigDecimal(allW);
    System.out.format("Total weight \t %.4f", bd);
    System.out.println();

    double max = 0;
    int imax = 0;
    for (int i = 0; i <= pNames.length - 1; i++) {
        System.out.format(pNames[i] + " \t %.4f", new BigDecimal(pWeight[i]).divide(bd, 4, BigDecimal.ROUND_HALF_UP));
        System.out.println("%");
        if (max < pWeight[i]) {
            max = pWeight[i];
            imax = i;
        };
    }

    System.out.println(pNames[imax] + " is greatest planet. Weight -" + pWeight[imax]);
    System.out.println("It in " + (new BigDecimal(pWeight[imax]).divide(new BigDecimal(allW - pWeight[imax]), 1, BigDecimal.ROUND_HALF_UP)) + " times bigets then rest.");
}
}
