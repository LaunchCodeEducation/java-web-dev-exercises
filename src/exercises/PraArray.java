

import java.util.Scanner;

public class PraArray {
    public static void main(String[] args) {
        int[] arrays = {1, 1, 2, 3, 5, 8};


        for (int i = 0; i < arrays.length; i++) {


            System.out.println("array (" + (i) + "):" + arrays[i]);
        }
        System.out.println("\n");
        System.out.print("odd numbers:\n");
        for (int i = 0; i < arrays.length; i++) {
            // int[] array = new int[arrays.length];

            if (arrays[i] % 2 != 0) {

                System.out.println( "array("+i+"):"+arrays[i]);
            }


        }
    }
}