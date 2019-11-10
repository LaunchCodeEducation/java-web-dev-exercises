package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        float milesDriven = input.nextFloat();
        System.out.println("How much gas have you used in gallons?");
        float gasInGallons = input.nextFloat();
        float milesPerGallon = milesDriven / gasInGallons;
        String printStatement = "Your car gas mileage equals " + milesPerGallon;
        System.out.println(printStatement);
    }
}
