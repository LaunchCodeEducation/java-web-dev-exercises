package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountCharacters {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a mission:");
        System.out.print(
                "1 - Basic Mission\n" +
                "2 - Bonus Mission\n" +
                "3 - Super Bonus\n" +
                "Your selection: ");

        switch (input.nextInt()) {
            case 1:
                System.out.println("\nBasic Mission:");
                basicMission();
                break;
            case 2:
                System.out.println("\nBonus Mission:");
                bonusMission();
                break;
            case 3:
                System.out.println("\nSuper Bonus:");
                superBonus();
                break;
        }

        input.close();
    }

    public static void basicMission() {
        String quote = "If the product of two terms is zero then" +
                " common sense says at least one of the two terms has to be" +
                " zero to start with. So if you move all the terms over to" +
                " one side, you can put the quadratics into a form that can" +
                " be factored allowing that side of the equation to equal" +
                " zero. Once you’ve done that, it’s pretty straightforward" +
                " from there.";

        char[] quoteChArr = quote.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        countChars(quoteChArr, charCount);

        printHashMap(charCount);
    }

    public static void bonusMission() {
        Scanner input = new Scanner(System.in);
        String userInput = "";
        char[] userInputChArr;
        HashMap<Character, Integer> charCount = new HashMap<>();

        System.out.print("Please enter a string of characters and numbers: ");
        userInput = input.nextLine().toLowerCase();
        userInputChArr = userInput.toCharArray();

        input.close();

        charCount = countChars(userInputChArr, charCount);

        printHashMap(charCount);
    }

    public static void superBonus() throws IOException {
        char[] charArr;
        HashMap<Character, Integer> charCount = new HashMap<>();

        try {
            URL url = new URL("https://www.gutenberg.org/files/105/105-h/105-h.htm#chap01");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String str;
            while ((str = br.readLine()) != null) {
                str = str.toLowerCase();
                charArr = str.toCharArray();
                charCount = countChars(charArr, charCount);
            }
            br.close();
            printHashMap(charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printHashMap(HashMap<Character, Integer> charMap) {
        for (Map.Entry<Character, Integer> c : charMap.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }
    }

    public static HashMap<Character, Integer> countChars(char[] charArray, HashMap<Character, Integer> countMap) {
        for (char ch : charArray) {
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }
        return countMap;
    }
}
