package org.launchcode.java.studios.countingcharacters;

import java.util.*;

public class CharacterCounter {

    public static ArrayList<String> toArray(String input) {
        String userInput = input;
        // set a default string if the user doesn't provide an input string
        if (input.length() < 1) {
            userInput = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
            System.out.println("No input, using: " + userInput);
        }
        char[] inputArr = userInput.toCharArray();
        ArrayList<String> charsInInput = new ArrayList<>();
        for (char c : inputArr) {
            if ((c >= 'A' && c <= 'z')) {
                charsInInput.add(String.valueOf(c).toLowerCase());
            }
        }
        return charsInInput;
    }

    public static HashMap<String, Integer> countChars(ArrayList<String> input) {
        HashMap<String, Integer> counts = new HashMap<>();
        for (String c : input) {
            if (counts.containsKey(c)) {
                counts.replace(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        return counts;
    }

    public static void printChars(HashMap<String, Integer> input) {
        for (Map.Entry<String, Integer> character : input.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = input.nextLine();
        ArrayList<String> characterArray = toArray(userInput);
        HashMap<String, Integer> uniqueCounts = countChars(characterArray);
        printChars(uniqueCounts);
    }
}
