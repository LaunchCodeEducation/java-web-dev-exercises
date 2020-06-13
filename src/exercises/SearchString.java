package exercises;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String string = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of " +
                "a book,' thought Alice 'without pictures or " +
                "conversation?'";

        String searchCase;
        System.out.println(string);
        System.out.println("Enter search string:");
        Scanner input = new Scanner(System.in);
        searchCase = input.nextLine().toLowerCase();


        input.close();

        System.out.println("length of search term: " + searchCase.length());
        System.out.println("search term found: " + string.toLowerCase().contains(searchCase));
        System.out.println("Index of the Search String: " +string.indexOf(searchCase));

        String tempCase;
        String newStr;
        newStr = string.toLowerCase();

        if (newStr.contains(searchCase)) {
            tempCase = searchCase+" ";
            newStr = newStr.replaceAll(tempCase, "");
            tempCase = searchCase;
            newStr = newStr.replaceAll(tempCase, "");
            tempCase = " " + searchCase;
            newStr = newStr.replaceAll(tempCase, "");

             System.out.println(newStr);


        }

    }
}
