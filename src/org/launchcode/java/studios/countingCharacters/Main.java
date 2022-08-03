package org.launchcode.java.studios.countingCharacters;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input;

        input = new Scanner (System.in);

        System.out.println("Enter a quote: ");
        String phrase = input.nextLine();
        input.close();

//        String quote = "If the product of two terms is zero then common sense says at" +
//                " least one of the two terms has to be zero to start with. So if you move all the " +
//                "terms over to one side, you can put the quadratics into a form that can be factored " +
//                "allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
//                "straightforward from there.";

        stringConversion.CountChars(phrase);
    }
}
