package exercises.2-4;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectange: ");
        double length = input.nextDouble();

        System.out.println("Enter the length of the rectange: ");
        double width = input.nextDouble();

        System.out.println("The area is: " + length * width);

        Systesm.out.println("How many miles have you driven?");
        double numMiles = input.nextDouble();

        System.out.println("How much gas did you use? In gallons.");
        double numGallons = input.nextDouble();

        double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + " mpg.");

        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println(aliceText.toLowerCase(Locale.ROOT));
        System.out.println(aliceText);

        System.out.println(aliceText.toLowerCase(Locale.ROOT).contains("alice".toLowerCase(Locale.ROOT)));

        System.out.println("Enter a word that contained in the aliceText: ");
        String aliceWord = input.nextLine();

        int wordIndex = aliceText.indexOf(aliceWord);
        int wordLength = aliceWord.length();
        System.out.println(wordIndex);
        System.out.println(wordLength);

        String aliceTextmodified = aliceText.replace(aliceWord, "");
        System.out.println(aliceTextmodified);

    }
}
