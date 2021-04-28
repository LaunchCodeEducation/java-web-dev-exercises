package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacter {
    public static void main(String[] args) {
        String phrase = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = phrase.toCharArray();

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i=0; i < charactersInString.length; i++ ) {
            if (letters.containsKey(charactersInString[i])) {
                int currentValue = letters.get(charactersInString[i]);
                letters.put(charactersInString[i], currentValue + 1);
            } else {
                letters.put(charactersInString[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            System.out.println(letter.getKey() + " (" + letter.getValue() + ")");
        }


    }

}
