package exercises;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            if ( i%2 == 1 ) System.out.println(i);
        }


        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }


    public static void main(ArrayList<String> arr) {

        Scanner input = new Scanner(System.in);

        String str = "Java convert String to ArrayList";

        // split string by no space
        String[] strSplit = str.split("");

        // Now convert string into ArrayList
        ArrayList<String> strList = new ArrayList<>(
                Arrays.asList(strSplit));

        // Now print the ArrayList
        for (String s : strList) {
            System.out.println(s);
            System.out.println("Enter a word length: ");
            int numChars = input.nextInt();
            if (numChars == s.length()) {
                System.out.println(s);
            }
        }

    }

    }



