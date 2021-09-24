package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CharacterCounter {

    public static ArrayList<Character> toArray(String input) {
        String userInput = input;
        // set a default string if the user doesn't provide an input string
        if (input.trim().isEmpty()) {
            userInput = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
            System.out.println("User input was empty, using this instead: " + userInput);
        }
        String userInputLower = userInput.toLowerCase();
        char[] inputArr = userInputLower.toCharArray();
        ArrayList<Character> charsInInput = new ArrayList<>();
        for (char c : inputArr) {
            if ((c >= 'a' && c <= 'z')) {
                charsInInput.add(c);
            }
        }
        return charsInInput;
    }

    public static HashMap<Character, Integer> countChars(ArrayList<Character> input) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (Character c : input) {
            if (counts.containsKey(c)) {
                counts.replace(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        return counts;
    }

    public static void printChars(HashMap<Character, Integer> input) {
        if (input.size() == 0) {
            System.out.println("Only non-alphabetic characters were provided :(");
        }
        for (Map.Entry<Character, Integer> character : input.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full path of file or input string: ");
        String userInput = input.nextLine();
        String stringInput = SetInput.main(userInput);
        ArrayList<Character> characterArray = toArray(stringInput);
        HashMap<Character, Integer> uniqueCounts = countChars(characterArray);
        printChars(uniqueCounts);
    }
}
