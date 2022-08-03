package org.launchcode.java.studios.countingCharacters;


import java.util.HashMap;
import java.util.Map;

public class stringConversion {
    public static void CountChars(String input) {

//        turn string to array of characters
        char[] characters = input.toUpperCase().toCharArray();

        HashMap<Character, Integer> scores = new HashMap<>();

        for (char letter : characters){
            if(Character.isLetter(letter)) {
//                if scores doesn't have letter then add it to scores HashMap
                if(!scores.containsKey(letter)){
                    scores.put(letter, 1);
                }else {
                    scores.put(letter, (scores.get(letter) + 1));
                }


            }


            }
        for (Map.Entry<Character, Integer> score : scores.entrySet()) {
            System.out.printf("%S : %S%n", score.getKey(), score.getValue());
        }


        }


    }

