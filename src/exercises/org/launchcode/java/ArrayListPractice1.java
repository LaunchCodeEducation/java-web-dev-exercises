package exercises.org.launchcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice1 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(


                Arrays.asList(
                        1,
                        2,
                        3,
                        4,
                        5,
                        6,
                        7,
                        8,
                        9,
                        10

                )
        );
        System.out.println(sumEven(numbers));
        ArrayList<String> memes = new ArrayList<>(
                Arrays.asList(
                        "nah bruh",
                        "such blank",
                        "much wow",
                        "aname",
                        "lible",
                        "table")
        );
        System.out.println("what is the length of word you desire? ");
        int wordLength = input.nextInt();

        designatedWord(memes,wordLength);
    }
        public static int sumEven (ArrayList < Integer > arr) {
            int total = 0;
            for (int i : arr) {
                if (i % 2 == 0) {
                    total += i;
                }
            }
            return total;
        }
        public static void designatedWord (ArrayList < String > wordCollection ,int length) {
            for (String word : wordCollection) {
                if (word.length() == length) {
                    System.out.println(word);
                }
            }
        }
    }
