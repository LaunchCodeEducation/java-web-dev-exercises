        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.util.*;
        import  java.util.Scanner;

public class CountingChar {
    static  String str;
    static String Path = "/Users/lakshmi/Documents/MyClass/java_project/java-web-dev-exercises/src/org/launchcode/java/studios/File.txt/input.txt";
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(Path));
            while((str=br.readLine()) != null){
                System.out.println("File input : " +str);
                str = str.replaceAll("[^a-zA-Z]","").toLowerCase();
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
            br.close();
        }catch(Exception e){
            e.printStackTrace();
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







