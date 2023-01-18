package exercises.chap2;
import java.util.Scanner;

public class GallonConversion {
    public static void main (String[] args) {
        Scanner milesInput = new Scanner(System.in);
        Scanner gasInput = new Scanner(System.in);

        System.out.println("How many miles have you driven?: ");
        Float miles = milesInput.nextFloat();
        System.out.println("How much gas have you consumed?: ");
        Float gas = milesInput.nextFloat();

        Float mpg = miles / gas ;

        System.out.println("You've driven " + mpg + " miles per gallon");
    }

}
