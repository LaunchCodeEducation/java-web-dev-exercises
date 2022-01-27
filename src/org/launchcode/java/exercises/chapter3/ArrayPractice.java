package org.launchcode.java.exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] myArray = { 1, 1, 2, 3, 5, 8 };

        for (int e : myArray) {
            System.out.println(e);
        }

        for (int j : myArray) {
            if (j % 2 != 0) {
                System.out.println("ODD number: " + j);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayOfWords = sentence.split("\\. ");

        System.out.println(Arrays.toString(arrayOfWords));
    }
}
