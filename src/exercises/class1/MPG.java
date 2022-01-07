package exercises.class1;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Miles driven: ");

        int milesDriven = input.nextInt();

        System.out.println("Gas consumed in gallons: ");

        int gallonsConsumed = input.nextInt();

        System.out.println("MPG: " + (milesDriven / gallonsConsumed));
    }
}
