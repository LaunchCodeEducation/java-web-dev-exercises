package exercises2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i =1; i <11; i++) {
            numbers.add(i);
        }
        Integer sumOfEven = sumEvenNum(numbers);
        System.out.println(sumOfEven);
    }

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
