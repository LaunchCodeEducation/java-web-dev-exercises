package exercises.org.launchcode.java;

import java.util.Arrays;

public class Controllcollections4and5 {
    public static void main(String[] args){
        //creating an array through a string

        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

        paragraph.split("\\.");
        String [] paraArray = paragraph.split("\\.");
        System.out.println(Arrays.toString(paraArray));
    }
}
