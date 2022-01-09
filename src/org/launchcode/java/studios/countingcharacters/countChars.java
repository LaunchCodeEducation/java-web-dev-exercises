package org.launchcode.java.studios.countingcharacters;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class countChars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String theMsg = input.nextLine();

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

        for(Map.Entry<String, Integer> indCount : theCount.entrySet()){
            System.out.println(indCount.getKey() + " (" + indCount.getValue() + ")");
        }
    }
}
