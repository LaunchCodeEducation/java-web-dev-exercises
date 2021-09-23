package exercises2;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int sumEvenNum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 ==0) {
                sum += num;
            }
        }
        return sum;
    }
}
