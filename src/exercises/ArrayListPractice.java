package exercises;

import java.util.Collections;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfInts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] list = {1, 7, 6, 11, 3, 4, 8, 12, 6, 9};
            arrayOfInts.add(i, list[i]);
        }
        System.out.println(evenSum(arrayOfInts));

        ArrayList<String> wordArrayList = new ArrayList<>();
        wordArrayList.add("Seven");
        wordArrayList.add("pickles");
        wordArrayList.add("make");
        wordArrayList.add("the");
        wordArrayList.add("nicest");
        wordArrayList.add("snack");
        fiveLetterWord(wordArrayList);

        String poem = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat them in a house." +
                " I will not eat them with a mouse.";
        String[] poemArray = poem.split(" ");
        ArrayList<String> poemArrayList = new ArrayList<>();
        Collections.addAll(poemArrayList, poemArray);
        fiveLetterWord(poemArrayList);
    }

    public static Integer evenSum(ArrayList<Integer> arrayList) {
        int i = 0;
        int evenSum = 0;
        while (i < arrayList.size()) {
            if (arrayList.get(i) % 2 == 0) {
                evenSum += arrayList.get(i);
            }
            i++;
        }
        return evenSum;
    }

    public static void fiveLetterWord(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == 5) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
