package exercises;

import java.util.Scanner;

public class L02_4_2_5_Strings {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no" +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or" +
                "conversation?'";
        Scanner input = new Scanner(System.in);
        String searchTerm;
        int searchIndex;

        System.out.println("**** Alice In Wonderland ****");
        System.out.println("Enter a search term: ");
        searchTerm = input.nextLine();

        alice = alice.toLowerCase();
        searchTerm = searchTerm.toLowerCase();
        searchIndex = alice.indexOf(searchTerm);

        if (searchIndex >= 0) {
            System.out.println("Search term '" + searchTerm + "' found at index " + searchIndex + ".");
            System.out.println("String length: " + alice.length() + "\t" + "Search term length: " + searchTerm.length());
            alice = alice.replace(searchTerm, "");
            System.out.println("Updated string length: " + alice.length());
        } else {
            System.out.println("Search term not found.");
        }
    }
}
