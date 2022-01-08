package exercises.class2;
import java.util.*;

public class ArrayListPractice {
    public static int findSum(ArrayList<Integer> array){
        int evenSum = 0;

        for(int num : array){
            if(num % 2 == 0){
                evenSum += num;
            }
        }

        return evenSum;
    }

    public static void returnWord(ArrayList<String> array, int theLength){
        for(String theWord : array){
            if(theWord.length() == theLength){
                System.out.println(theWord + "\n");
            }
        }

    }

    public static void main(String[] args){
        ArrayList<Integer> theArr = new ArrayList<>(Arrays.asList(32,67,84,33,12));

        System.out.println("3.7.2: " + findSum(theArr));

        String theMainString = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat " +
                "them in a house. I will not eat them with a mouse.";

        ArrayList<String> theOtherArr = new ArrayList<>(Arrays.asList(theMainString.split(" ")));
        Scanner input = new Scanner(System.in);
        System.out.println("What length word are we searching for: ");
        int wordLen = input.nextInt();
        returnWord(theOtherArr, wordLen);

    }
}
