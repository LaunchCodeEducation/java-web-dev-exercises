package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) throws FileNotFoundException {
        CharacterCount();
        CharacterCountFile();
    }

    public static void CharacterCount() {
//        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Put in your desire phrase: ");
        String phrase = input.nextLine();


        char[] charactersInString = phrase.toCharArray();

        HashMap<Character, Integer> characterCountCaseSensitive = new HashMap<>();
        HashMap<Character, Integer> characterCountCaseInSensitive = new HashMap<>();
        HashMap<Character, Integer> characterCountCaseInSensitiveExclusive = new HashMap<>();

        // case sensitive
        for (char c: charactersInString) {
            if (characterCountCaseSensitive.containsKey(c)) {
                characterCountCaseSensitive.put(c,characterCountCaseSensitive.get(c) + 1);
            } else {
                characterCountCaseSensitive.put(c, 1);
            }
        }

        System.out.println("Case sensitive result:");
        for (Map.Entry<Character, Integer> c : characterCountCaseSensitive.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }

//        char f = Character.toLowerCase('L');

        // case in-sensitive
        for (char c : charactersInString) {
            c = Character.toLowerCase(c);
            if(characterCountCaseInSensitive.containsKey(c)) {
                characterCountCaseInSensitive.put(c, characterCountCaseInSensitive.get(c) + 1);
            } else {
                characterCountCaseInSensitive.put(c, 1);
            }
        }

        System.out.println("Case in-sensitive result:");
        for (Map.Entry<Character, Integer> ci : characterCountCaseInSensitive.entrySet()) {
            System.out.println(ci.getKey() + ": " + ci.getValue());
        }

//        Exclude non-alphabetic characters.

        for (char c : charactersInString) {
            c = Character.toLowerCase(c);
            if (Character.isLetter(c)) {
                if (characterCountCaseInSensitiveExclusive.containsKey(c)) {
                    characterCountCaseInSensitiveExclusive.put(c, characterCountCaseInSensitiveExclusive.get(c) + 1);
                } else {
                    characterCountCaseInSensitiveExclusive.put(c, 1);
                }
            }
        }

        System.out.println("Case in-sensitive result (Exclude non-alphabetic characters.):");
        for (Map.Entry<Character, Integer> ci : characterCountCaseInSensitiveExclusive.entrySet()) {
            System.out.println(ci.getKey() + ": " + ci.getValue());
        }

//        System.out.println(' ' + ": " + Character.isLetter((' ')));
    }


    public static void CharacterCountFile() throws FileNotFoundException {
//        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


        // without FileNotFoundException, we could also use try/catch block

        Scanner inputFilePath = new Scanner(System.in);
        System.out.println("Put in your file path: ");
        String fileName = inputFilePath.nextLine();

        Scanner inputFileName = new Scanner(new File(fileName));
        String phrase = inputFileName.nextLine();


//        String fileName = fileHandler.nextLine();
////        Path filePath = Path.of(fileName);
//        Path filePath = Paths.get(fileName);
//        String phrase = Files.readString(filePath);


        char[] charactersInString = phrase.toCharArray();

        HashMap<Character, Integer> characterCountCaseSensitive = new HashMap<>();
        HashMap<Character, Integer> characterCountCaseInSensitive = new HashMap<>();
        HashMap<Character, Integer> characterCountCaseInSensitiveExclusive = new HashMap<>();

        // case sensitive
        for (char c: charactersInString) {
            if (characterCountCaseSensitive.containsKey(c)) {
                characterCountCaseSensitive.put(c,characterCountCaseSensitive.get(c) + 1);
            } else {
                characterCountCaseSensitive.put(c, 1);
            }
        }

        System.out.println("Case sensitive result:");
        for (Map.Entry<Character, Integer> c : characterCountCaseSensitive.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }

//        char f = Character.toLowerCase('L');

        // case in-sensitive
        for (char c : charactersInString) {
            c = Character.toLowerCase(c);
            if(characterCountCaseInSensitive.containsKey(c)) {
                characterCountCaseInSensitive.put(c, characterCountCaseInSensitive.get(c) + 1);
            } else {
                characterCountCaseInSensitive.put(c, 1);
            }
        }

        System.out.println("Case in-sensitive result:");
        for (Map.Entry<Character, Integer> ci : characterCountCaseInSensitive.entrySet()) {
            System.out.println(ci.getKey() + ": " + ci.getValue());
        }

//        Exclude non-alphabetic characters.

        for (char c : charactersInString) {
            c = Character.toLowerCase(c);
            if (Character.isLetter(c)) {
                if (characterCountCaseInSensitiveExclusive.containsKey(c)) {
                    characterCountCaseInSensitiveExclusive.put(c, characterCountCaseInSensitiveExclusive.get(c) + 1);
                } else {
                    characterCountCaseInSensitiveExclusive.put(c, 1);
                }
            }
        }

        System.out.println("Case in-sensitive result (Exclude non-alphabetic characters.):");
        for (Map.Entry<Character, Integer> ci : characterCountCaseInSensitiveExclusive.entrySet()) {
            System.out.println(ci.getKey() + ": " + ci.getValue());
        }

//        System.out.println(' ' + ": " + Character.isLetter((' ')));
    }

}
