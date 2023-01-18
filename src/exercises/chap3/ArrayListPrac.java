package exercises.chap3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ArrayListPrac {
    public static void main (String[] args){
        // variables
        ArrayList<Integer> sum = new ArrayList<>();
        int min = 0;
        int max = 100;

        // AL of even ints
        for(int i = 0; i < 10; i++) {
            int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
            if (random_int % 2 == 0) sum.add(random_int);
        }
        System.out.println(sum);

        // Part 2
        ArrayList<String> strings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStr;

        System.out.println("\nEnter a new string for an AL\n" +
                "If your string is 5 characters long, it will be added to the AL\n" +
                "To break the loop, enter empty string: ");
        do {
            newStr = input.nextLine();

            if (!newStr.equals("") && (newStr.length() == 5)) {
                strings.add(newStr);
            }
        } while(!newStr.equals(""));
        System.out.println(strings);

    }
}
