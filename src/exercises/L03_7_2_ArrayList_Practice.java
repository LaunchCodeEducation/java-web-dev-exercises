package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class L03_7_2_ArrayList_Practice {
    public static void main(String[] args) {

//        #1 Write a static method to find the sum of all the even numbers in
//        an ArrayList. Within main, create a list with at least 10 integers
//        and call your method on the list.

        ArrayList<Integer> intArrList = new ArrayList<Integer> (
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
        );

        Integer sumOfEvenNumber = 0;

        for (Integer num : intArrList) {
            if (num % 2 == 0) {
                sumOfEvenNumber += num;
            }
        }

        System.out.println("*** Sum of Even Numbers ***");
        System.out.println("sum = " + sumOfEvenNumber);

    }
}
