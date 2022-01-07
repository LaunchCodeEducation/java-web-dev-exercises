package exercises.class1;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String AlicePassage = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        System.out.println("What to look for:?");

        String passageSearch = input.nextLine();

        if(AlicePassage.toLowerCase().contains(passageSearch.toLowerCase())){
            int strIndex = AlicePassage.toLowerCase().indexOf(passageSearch.toLowerCase());
            int strLen = passageSearch.length();

            System.out.println("Location: " + strIndex);
            System.out.println("Length: " + strLen);

            String newPassage = AlicePassage.substring(0, strIndex) + AlicePassage.substring(strIndex + strLen);

            System.out.println("new passage: " + newPassage);
        } else {
            System.out.println("False");
        }
    }
}
