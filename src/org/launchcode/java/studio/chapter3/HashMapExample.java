package org.launchcode.java.studio.chapter3;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("Type your sentence: ");
        String quote = input.nextLine().toLowerCase();
        input.close();
//        String modifiedQuote = quote.replaceAll("[^\\W\\s]/gi", "");
        String regex = "\\W";
        String modifiedQuote = quote.replaceAll(regex,"");
        char[] arr = modifiedQuote.toCharArray();

        HashMap<Character, Integer> myHashmap = new HashMap<>();

        // LOOP the array
        for (char letter : arr) {
            if (!myHashmap.containsKey(letter)) {
                myHashmap.put(letter, 1);
            } else {
                myHashmap.put(letter, myHashmap.get(letter) + 1);
            }
        }

//        for (Map.Entry<Character, Integer> element : myHashmap.entrySet()) {
//            System.out.println(element.getKey() + ": " + element.getValue());
//        }
//
        // More simple way
        for (char c : myHashmap.keySet()) {
            System.out.println(c + ": " + myHashmap.get(c));
        }
    }
}
