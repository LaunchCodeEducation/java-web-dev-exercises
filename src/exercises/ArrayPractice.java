package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        int i = 0;
        while (i < numbers.length) {
            if (!(numbers[i]%2 == 0)) {
                System.out.println(numbers[i]);
            }
            i++;
        }

        String string = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat them in a house." +
                " I will not eat them with a mouse.";
        String[] stringArray = string.split("\\.");
        System.out.println(Arrays.toString(stringArray));

    }
}
