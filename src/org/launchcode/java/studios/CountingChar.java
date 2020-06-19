

        import java.util.*;
        import  java.util.Scanner;

public class CountingChar {


    public static void main(String[] args) {

        //String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String str;
        System.out.print("please enter some string: ");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        str=str.replaceAll("[^a-zA-Z]","").toLowerCase();
        char[] chars = str.toCharArray();
        ArrayList<Character> array = new ArrayList<>();
        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < chars.length; i++) {
            array.add(chars[i]);
            set.add(chars[i]);
        }
        for(Character itm : set)   {
            int val = countOccur(itm,array);
            System.out.println(itm+":"+val);
        }

    }

    public static int countOccur(Character set,ArrayList array) {
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == set ) {
                count++;
            }
        }
        return count;
    }

}







