package exercises;

import java.util.Scanner;

public class L02_4_2_4_Strings {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no" +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or" +
                "conversation?'";
        alice = alice.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("**** Alice In Wonderland ****");
        System.out.println("Enter a search term: ");
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();

        System.out.println("Search term found: " + alice.contains(searchTerm));
    }
}
