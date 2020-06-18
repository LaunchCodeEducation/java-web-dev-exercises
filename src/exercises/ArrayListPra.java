import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPra {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int number, total = 0, i,sum=0 ;
        System.out.println("Enter number or enter 0 to end:");
        for ( i = 0; i <= list.size(); i++) {

            number = input.nextInt();
            list.add(number);

            if (number == 0) {
              list.remove(list.size()-1);
                break;
            }

        }
        System.out.println("Array list: " + (list));
            for (int j : list) {
                // System.out.println(list.get(i));
                total = total + list.get(j-1);
            }
            System.out.println("the sum of Array numbers is:" + total);

           for( i=0 ; i < list.size() ; i++){
               int even =list.get(i)%2;

               if( even == 0) {
                   sum = sum + list.get(i);

               }

           }
        System.out.println("the sum of Array of even numbers is:" + sum);
        }


    }




