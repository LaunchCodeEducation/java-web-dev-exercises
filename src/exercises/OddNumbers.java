
import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8};
        System.out.print("Array values:\n");
        for(int i=0;i<array.length;i++){
            System.out.println( "array("+i+"):"+array[i]);
        }

        System.out.print("\nodd numbers:\n");
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                System.out.println( "array("+i+"):"+array[i]);
            }


        }
    }
}

