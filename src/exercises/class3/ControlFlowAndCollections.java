package exercises.class3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControlFlowAndCollections {
    public static void main(String[] args) {

        // 3.7.1. Array Practice

        int [] intArr = {1, 1, 2, 3, 5, 8};

        for (int n : intArr) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 1) {
                System.out.println(intArr[i]);
            }
        }

        String s1 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] s2 = s1.split(" ");
        System.out.println(s2);
        for (String s: s2) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(s2));

        String[] s4 = s1.split("//.");
        System.out.println(s4);
        for(String sentence : s4) {
            System.out.println(sentence);
        }
        System.out.println(Arrays.toString(s4));

//      3.7.2. ArrayList Practice
        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(1, 2));
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        arrlist.add(7);
        arrlist.add(8);
        arrlist.add(9);
        arrlist.add(10);

        System.out.println(calculateEvenSum((arrlist)));
//        System.out.println(printFiveLetterWord(s1.split(" ")));
    }

    public static int calculateEvenSum( ArrayList<Integer> arr) {
        int sum = 0;

        for (int num : arr) {
            if ( num % 2 == 1) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printFiveLetterWord( List<String> strList) {
        for (String word: strList) {
            if (word.length() == 5 ) {
                System.out.println(word);
            }
        }
    }
}
