
import java.util.Scanner;

public class hw1 {

public static void main(String[] args) {

    // Task 1
    System.out.println((3.252 + 5.2586 + 7.5452) / 3);
    System.out.println();

    // Task 2
    double a = 2.454;
    double b = 10.989;

    System.out.println(a + "x+" + b + "=0; x=" + (-b / a));
    System.out.println();

    //Task 3
    Scanner in = new Scanner(System.in);

    System.out.println("Input number (a):");
    int num = in.nextInt();
    System.out.println("Input power (n):");
    int pwr = in.nextInt();

    System.out.println("a^n=" + num + "^" + pwr + "=" + Math.pow(num, pwr) + "\n");
    System.out.println();

    //Task 4
    final double pi = 3.141592653589793;
    System.out.println("Input radius (r):");
    double rad = in.nextDouble();
    System.out.println("S=Pi*r^2=" + pi + "*" + rad + "^2=" + pi * rad * rad);
    System.out.println("C=2*Pi*r=2*" + pi + "*" + rad + "=" + 2 * pi * rad);
    System.out.println();

    // Task 5
    float usd_K = 22.91f;
    float eur_K = 24.91f;
    float rub_K = 0.33f;

    System.out.println("Input sum (UAH):");
    float uah = in.nextFloat();
    System.out.println(uah + " uah = " + uah / usd_K + " usd");
    System.out.println(uah + " uah = " + uah / eur_K + " eur");
    System.out.println(uah + " uah = " + uah / rub_K + " rub");
    System.out.println();

    // Task 6
    final float lmile_K = 1.60934f;
    final float mmile_K = 1.851995f;

    System.out.println("Input km:");
    float km = in.nextFloat();
    System.out.println(km + " km = " + km / lmile_K + " land miles");
    System.out.println(km + " rm = " + km / mmile_K + " marine miles");
    System.out.println();

    // Task 7
    double p = 2.454;
    double s = 10.989;

    System.out.println(s + "*" + p + "%=" + s / 100 * p);
    System.out.println();

    // Task 8
    System.out.println("Input length (X):");
    double len = in.nextDouble();
    System.out.println("D=X/Pi=" + len + "/" + pi + "=" + len / pi);
    System.out.println();

    // Task 9
    System.out.println("Input *C:");
    double cel = in.nextDouble();
    System.out.println(cel + " *C = " + (1.8 * cel + 32d) + " *F");
    System.out.println(cel + " *C = " + (cel + 273.15) + " *K");
    System.out.println(cel + " *C = " + ((100d - cel) * 3d / 2d) + " *De");
    System.out.println("Input *F:");
    double far = in.nextDouble();
    System.out.println(far + " *F = " + ((far - 32d) / 1.8) + " *C");
    System.out.println();

    // Task 10
    System.out.println("a=" + a + "; b=" + b);
    double c;
    c = a;
    a = b;
    b = c;
    System.out.println("a=" + a + "; b=" + b);
    a = a * b;
    b = a / b;
    a = a / b;
    System.out.println("a=" + a + "; b=" + b);

}
}
