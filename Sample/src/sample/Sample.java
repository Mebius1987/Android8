
package sample;

import java.util.Arrays;


public class Sample {

   public static void va(int a, double b, String... s) {
        // в методе могут быть другие параметры, кроме ...
    }

    public static void va(int... v) {
        // вполне обычный метод
        System.out.println("1");
    }

    public static void va(int a, int... v) {
        // ошибки нет, но вызвать такой метод не получится - ambigious call
        System.out.printf("2");
        System.out.format("gujygjk",66);
    }
/*
    public static void va(int a, double b, String... v, boolean c) {
        // ... в середине сигнатуры не допускается!
    }

    public static void va(int... i, String... s) {
        // несколько ... не допускается!
    }
    */
    public static void main(String[] args) {
            va();
    }
    
}
