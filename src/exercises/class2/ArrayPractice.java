package exercises.class2;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args){
        int newArr[] = {1,1,2,3,5,8};

        for(int number : newArr){
            System.out.println(number);
        }

        String theString = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat " +
                "them in a house. I will not eat them with a mouse.";

       // String[] secondString = theString.split(" ");

        System.out.println(Arrays.toString(theString.split("\\.")));


    }
}
