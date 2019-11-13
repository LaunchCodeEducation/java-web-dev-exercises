package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        //create string that is storing the String whose characters we will count
        String mainString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        System.out.println("Enter the string whose characters you want to count:");
        Scanner input = new Scanner(System.in);
        if (input.hasNext()) {
            mainString = input.nextLine();
        }

        //create HashMap that is empty but will store characters

        HashMap<Character, Integer> characterCount = new HashMap<>();
        //convert mainString to array of characters
        char[] charactersInString = mainString.toLowerCase().toCharArray();
        System.out.println(charactersInString);

        //find out which characters are in the string, and count their iteration once you've found one occurrence of it.
        for (int i = 0; i < charactersInString.length; i++) {
            //check to see if the character is alphabetic or not
            if (Character.isLetter(charactersInString[i])) {
                //check if the character is already stored in the HashMap
                while (!characterCount.containsKey(charactersInString[i])) {
                    //initiate a counter for each character iteration
                    int k = 0;
                    //check each character in the array again and see if it is equal to the current char in question
                    for (int j = 0; j < charactersInString.length; j++) {
                        if (charactersInString[i] == charactersInString[j]) {
                            k++;
                            //System.out.println(k);
                        }
                        //store each character and its iteration in a HashMap with key being character and value being number of iterations.
                        characterCount.put(charactersInString[i], k);
                    }
                    //System.out.println(characterCount);
                }
            }
        }
        //print the key/value set of the HashMap to the console.
//        System.out.println(characterCount);
        for(char c : characterCount.keySet()) {
            System.out.println(c + ": " + characterCount.get(c));
        }
    }
}
