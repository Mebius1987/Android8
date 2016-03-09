
package sample;

import java.util.Arrays;


public class Sample {

   static void changeArray(int[] ar) {
        ar = new int[20];
    }
    
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        changeArray(ar);
        System.out.println(Arrays.toString(ar)); // 100 2 3
    }
    
}
