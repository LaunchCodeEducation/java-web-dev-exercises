package CountingCharacters;


import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
//        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        File file = new File("src/CountingCharacters/random_text.txt");
        String text = "";
        try{
            Scanner file_input = new Scanner(file);
            while(file_input.hasNextLine()){
                String line = file_input.nextLine();
                text+=line;
            }
            file_input.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input a text: ");
//        String text = input.nextLine();
//        input.close();
        char[] charactersInString = text.toLowerCase().toCharArray();
//        declare the hashmap
        HashMap<Character, Integer> characterToCount = new HashMap<>();
//        As we go through the string

        for(char c: charactersInString){
//          the hashmap will grow (add characters to the hashmap as we iterate)
//            check if exists in hashmap

            if(Character.isAlphabetic(c)) {
                if (characterToCount.containsKey(c)) {
                    Integer totalCount = characterToCount.get(c);
                    //                plus one into that totalCount
                    totalCount++;
                    //                update value of an existing key

                    characterToCount.put(c, totalCount);
                } else {
                    characterToCount.put(c, 1);
                }
            }
//          we will use this hashmap to keep count of the letters that are found
//        everytime we put in a key we will put in the value (count)
//        if we have a repeat, increase the existing value (count)
        }
        System.out.println(characterToCount);
    }
}
