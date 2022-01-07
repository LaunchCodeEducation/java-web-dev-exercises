package Studio.org.launchcode.java;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args){
        HashMap<Character,Integer> tony = new HashMap<>();
        //String  = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
          Scanner scan = new Scanner(System.in);
          System.out.println("enter a string: ");
          String myStr = scan.nextLine();
          myStr =myStr. toLowerCase();

          for(int i=0; i < myStr.length(); i ++){
              int asciiValue = myStr.charAt(i);
              System.out.println(myStr.charAt(i) + "= " + asciiValue);
              if(asciiValue > 96 && asciiValue <123){

              }
          }

                char[] charArray = myStr.toCharArray();

        for(char ch: charArray){
            if (!tony.containsKey(ch)) {
                tony.put(ch,1);
            }else{
                tony.put(ch,tony.get(ch) +1);
            }

           }
        for (Map.Entry<Character, Integer> entry: tony.entrySet()){
            System.out.println(entry.getKey() +"( " + entry.getValue() + ")");
        }
    }


}
