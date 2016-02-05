
import java.util.*;
import java.io.*;

public class hw0 {

public static void main(String[] args) {

    // Task 1 --------------------------------------------------------------------
    System.out.println("\"To be \n\tor not\n\t\t to be \n\t\t\t/Shekspear/\"");

    // Task 2 --------------------------------------------------------------------
    String str = "I love Java!!!";
    for (int i = 0; i <= 4; i++) {
        System.out.println(str);
        str = "\t" + str;
    }

    // Task 3 --------------------------------------------------------------------
    System.out.println("'\\t', '\\n', '\\\\', '\\'','\\\"'");

    // Task 4 --------------------------------------------------------------------
    Scanner in = new Scanner(new File("HomeWork.java"));
    while (in.hasNext()) {
        System.out.println(in.nextLine());
    }
    in.close();

    // Task 5 --------------------------------------------------------------------
    String[] mon = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
    GregorianCalendar cal = new GregorianCalendar();
    System.out.println("\t\t" + mon[cal.get(Calendar.MONTH)]);
    System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");
    cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 0);
    System.out.print(new String(new char[cal.get(Calendar.DAY_OF_WEEK) - 1]).replace("\0", "\t"));
    for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
        System.out.print(i);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
            System.out.print("\n");
        } else {
            System.out.print("\t");
        }
    }
}
}
