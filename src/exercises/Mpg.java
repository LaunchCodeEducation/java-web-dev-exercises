package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many miles have you driven: ");
        double miles = input.nextDouble();

        System.out.print("How much gas have you consumed in gallons: ");
        double gas = input.nextDouble();

        double mpg = miles / gas;
        System.out.println("Your MPG for the trip is: " + mpg);

    }
}
