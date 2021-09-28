package exercises.Lesson2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayListPractice {
    /*Exercise 1*/
    public static int evenSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int number : arr) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    /*Exercise 2 + 3*/
    public static void printLetters(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of letters: ");
        int numOfLetters = input.nextInt();
        for (String word : arr) {
            if (word.length() == numOfLetters) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            values.add(i);
        }

        /*BONUS Exercise 3*/
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        sentence = sentence.replace(",", "");
        sentence = sentence.replace(".", "");
        String[] sentenceSplit = sentence.split(" ");
        ArrayList<String> wordsArrList = new ArrayList<>(
                Arrays.asList(sentenceSplit));
        printLetters(wordsArrList);
    }
}