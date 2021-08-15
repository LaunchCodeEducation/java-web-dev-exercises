package exercises;

import java.util.Arrays;

public class L03_7_1_Array_Practice {
    public static void main(String[] args) {
        int[] numArr = new int[] {1, 1, 2, 3, 5, 8};

//        #2.	Loop through the array and print out each value, then modify
//        the loop to only print the odd numbers.

        System.out.println("*** Print each value ***");
        for (int num : numArr) {
            System.out.println(num);
        }

        System.out.println("\n*** Print odd number ***");

        for (int num : numArr) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

//        #3. For this exercise, use the string "I would not, could not..."
//        Use the split method to divide the string at each space and store
//        the individual words in an array. If you need to review the method
//        syntax, look back at the String methods table.

        String str = "I would not, could not, in a box. I would not, could" +
                " not with a fox. I will not eat them in a house. I will not" +
                " eat them with a mouse.";

        String[] strToArr = str.split(" ");

        System.out.println("*** Verify String to Array Back to String ***");
        System.out.println(Arrays.toString(strToArr));

//        #4. Repeat steps 3 and 4, but change the delimiter to split the
//        string into separate sentences.

        strToArr = str.split("[,\\.]");

        System.out.println(" Change delimiter ");
        System.out.println(Arrays.toString(strToArr));
    }
}
