package exercises.chap3;
import java.util.Arrays;

public class ArrayPrac {
    public static void main(String[] args) {
        // Part 1
        int[] intArr = {1, 1, 2 ,3, 5, 8};

        // Part 2
        for (int i : intArr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Part 3
        String message = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = message.split("\\.");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
