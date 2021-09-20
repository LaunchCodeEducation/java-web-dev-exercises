package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowerCaseSentence = firstSentence.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term:");
        String query = input.next();
        String searchQuery = query.toLowerCase();
        Boolean result = lowerCaseSentence.contains(searchQuery);
        System.out.println("Term '" + query + "' found? " + result);
        Integer index = lowerCaseSentence.indexOf(searchQuery);
        Integer length = query.length();
        System.out.println("The word has index "+ index + ", and length " + length);
        System.out.println("The new sentence is:");
//        System.out.println(firstSentence.substring(0,index) + firstSentence.substring(index + length + 1, firstSentence.length() - 1));
        System.out.println(firstSentence.replace(query, ""));

    }
}
