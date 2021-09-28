package exercises.Lesson2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args){
        /* Exercise 1 */
        int[] values = {1,1,2,3,5,8};

        /* Exercise 2 */
        for (int value: values){
            System.out.println(value);
        }
        /* Exercise 3 */
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitSentence = sentence.split(" ");
        /* Exercise 4 */
        System.out.println(Arrays.toString(splitSentence));
        /* Exercise 5 */
        String[] sentences = sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }
}
