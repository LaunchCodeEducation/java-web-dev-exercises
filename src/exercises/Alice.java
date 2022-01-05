package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        String wonderland = "Alice was beginning to get very " +
                "tired of sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought Alice 'without pictures or conversation?'";
        String alice = wonderland.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string to search for");
        String search = input.nextLine().toLowerCase();

        System.out.println(search);

Boolean result = alice.contains(search);
    System.out.println("wonderland contains your search term" + result);
   Integer index = alice.indexOf(search);
   Integer length = search.length();
   System.out.println("Your search  term first appears at index" + index + ". your term is" + length + " characters long" );
    }
}