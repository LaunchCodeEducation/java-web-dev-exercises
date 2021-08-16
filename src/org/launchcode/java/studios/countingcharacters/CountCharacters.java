package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then" +
                " common sense says at least one of the two terms has to be" +
                " zero to start with. So if you move all the terms over to" +
                " one side, you can put the quadratics into a form that can" +
                " be factored allowing that side of the equation to equal" +
                " zero. Once you’ve done that, it’s pretty straightforward" +
                " from there.";

        char[] quoteChArr = quote.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();
//        Character letter;
//        Integer count;

        for (char ch : quoteChArr) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> c : charCount.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }

    }
}
