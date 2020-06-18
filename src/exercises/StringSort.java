
import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args){
        String arr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        System.out.print(arr);
        String[] array = new String[100];
        array = arr.split(",");


        System.out.println("\n\n"+ Arrays.toString(array));

        String[] arra = new String[100];
        arra = arr.split("\\.");
        System.out.println("\n"+Arrays.toString(arra));

    }
}
