
import java.util.Scanner;
import java.util.ArrayList;

public class WordList {
    public static void main(String[] args) {
        ArrayList<String> word_list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newList="";
        ArrayList<String> newArray = new ArrayList<>();
        int num=0;

        System.out.println("Enter words:");

        do{
            newList = input.nextLine();
            if(!newList.equals("")){
                word_list.add(newList);
            }
        }while (!newList.equals(""));
            System.out.print("Array list : "+ word_list+"\n");
            System.out.println("Enter the word length to be searched: ");
            num=input.nextInt();
            for(String list : word_list){
                if(list.length() == num) {

                   newArray.add(list);

                }

            }
             System.out.println("\n Words with "+num+ " letters: "+newArray);
    }
}
