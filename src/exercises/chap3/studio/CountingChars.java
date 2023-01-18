package exercises.chap3.studio;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingChars {
    public static void main (String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        int count = 0;

        // Prompt User
        System.out.println("Enter A String to Be Evaluated: ");

        // Regex
        String string = input.nextLine().toLowerCase();
        String regex = "[a-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        // places all characters in their own array
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        char[] charactersInString = string.toCharArray();

        // Evaluation
        for (int i = 0; i < charactersInString.length; i++) {
            char letter = charactersInString[i];
            count = 0;

            for (int j = 0; j < charactersInString.length; j++) {
            if (charactersInString[j] == letter) {
                count++;
            }}

            System.out.println(charactersInString[i] + ": " + count);
        }

    }
}
