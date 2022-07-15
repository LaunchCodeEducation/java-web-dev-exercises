package exercises;

import java.util.Scanner;

public class AlicesWonderland {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Pick a word to find: ");
        String searchTerm = input.nextLine();

    if(alice.toLowerCase().contains(searchTerm)) {
        System.out.println("The string includes " + searchTerm + ".");
        int index = alice.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term is at index " + index + ". Your search term is "  + length + " characters."  );
        String newSentence = alice.replace(searchTerm, "");
        System.out.println(newSentence);
    } else {
        System.out.println(searchTerm + " is not included in the string.");
    }






    }
}
