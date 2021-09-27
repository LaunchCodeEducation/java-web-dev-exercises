package exercises;
import java.util.Locale;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter your search term: ");
        String searchTerm = input.nextLine().toLowerCase();

        Boolean contains = sentence.toLowerCase().contains(searchTerm);
        System.out.println("The results of your search are " + contains);

        System.out.println("The index of your search term is " + sentence.indexOf(searchTerm) + " and its length is " + searchTerm.length());

        String newSentence = sentence.toLowerCase().replace(searchTerm, "");
        System.out.println(newSentence);


    }
   }
