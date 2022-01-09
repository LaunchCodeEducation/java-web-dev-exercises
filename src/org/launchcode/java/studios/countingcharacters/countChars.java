package org.launchcode.java.studios.countingcharacters;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class countChars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("[HOW TO USE]\n [ENTER 'type' TO TYPE STRING]\n [ENTER 'file' TO SPECIFY FILE]");

        String theMsg = "";
        theMsg = input.nextLine().toLowerCase();

        switch(theMsg) {
            case "type":
                System.out.println("Enter string: ");

                theMsg = input.nextLine();
                break;

            case "file":
                System.out.println("Enter File Path: ");

                theMsg = ReadFile.readFile(input.nextLine());
                break;
        }

        Pattern alphaBet = Pattern.compile("[a-z]");
        Matcher isAlpha;

        String[] strArr = theMsg.toLowerCase().split("");
        HashMap<String, Integer> theCount = new HashMap<>();

        for(String theChar : strArr){
            isAlpha = alphaBet.matcher(theChar);

            if(isAlpha.find()) {
                if (!theCount.containsKey(theChar)) {
                    theCount.put(theChar, 1);
                } else {
                    theCount.put(theChar, theCount.get(theChar) + 1);
                }
            }
        }

        System.out.println(theMsg + " counted by char looks like: ");

        for(Map.Entry<String, Integer> indCount : theCount.entrySet()){
            System.out.println(indCount.getKey() + " (" + indCount.getValue() + ")");
        }
    }
}
