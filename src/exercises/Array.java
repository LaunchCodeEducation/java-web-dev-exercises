package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbersArray = { 1, 1, 2, 3, 5, 8};
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);
        int sumOfAllEvens = sumEven(numbersList);
        System.out.println(sumOfAllEvens);


        for (int i : numbersArray) {
            if ( i % 2 != 0 ) {
                System.out.println(i);
            }

            String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            String[] words = phrase.split(" ");
            System.out.println(Arrays.toString(words));

            String[] sentences = phrase.split("\\.");
            System.out.println(Arrays.toString(sentences));
        }

    }


    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }



}
