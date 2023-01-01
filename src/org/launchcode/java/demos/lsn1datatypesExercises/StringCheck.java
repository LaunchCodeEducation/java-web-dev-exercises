package org.launchcode.java.demos.lsn1datatypesExercises;
import java.util.Scanner;


public class StringCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister on the \nbank, and of having nothing to do: once or twice she had peeped into \nthe book her sister was reading, but it had no pictures or \nconversations in it, 'and what is the use of a book,' thought Alice \n'without pictures or conversation?'\n";
        System.out.println(text);
        System.out.println("What word would you like to find?");
        String word = input.nextLine().toLowerCase();
        boolean isPresent = text.toLowerCase().contains(word);
        int index = text.toLowerCase().indexOf(word);
        System.out.println("\nIt is " + isPresent + " that the above passage contains the word '" + word + "' at index " + index);


    }
}
