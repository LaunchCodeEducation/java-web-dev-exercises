package org.launchcode.java.exercises.chapter3;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int sum(ArrayList arr) {
        int result = 0;
        Integer[] nativeArray = new Integer[arr.size()];
        arr.toArray(nativeArray);

        for (int e : nativeArray) {
            result += e;
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(56);
        numbers.add(13);
        numbers.add(89);
        numbers.add(13);
        numbers.add(19);
        numbers.add(43);
        numbers.add(21);
        numbers.add(24);
        numbers.add(15);
        numbers.add(63);
        numbers.add(43);

        System.out.println(sum(numbers));
    }
}
