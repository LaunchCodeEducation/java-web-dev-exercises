package exercises;

import java.util.ArrayList;


public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(2);
            arr.add(11);
            arr.add(12);
            arr.add(15);
            arr.add(17);
            arr.add(22);
            arr.add(26);
            arr.add(29);
            arr.add(31);
            arr.add(36);
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
        System.out.println(total);
    }

}
