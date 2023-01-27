package exercises.chap2;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        // variables
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:\nonce or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it,\n'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        Scanner searchInput = new Scanner(System.in);

        // Prompt user
        System.out.println("The first sentence of Alice in the wonderland is:\n \n" + sentence);
        System.out.println("Enter a word to see if it's in the beginning of the book : ");

        // Evaluation
        sentence = sentence.toLowerCase();
        String str = searchInput.nextLine();

        if (sentence.contains(str)) {
            System.out.println("\ntrue" + "\nlocated at index " + sentence.indexOf(str) + "\nWith a length of " + str.length() + "\n");
            Integer trimNum = sentence.indexOf((str)) + str.length();
            String newSentence = sentence.substring(trimNum, sentence.length());
            System.out.println("New String:\n" + newSentence);
        }
        else System.out.println("\nfalse");
    }

}
