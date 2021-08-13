package exercises;

import java.util.Scanner;

public class L02_4_2_3_Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("**** Fuel Efficiency - Miles Per Gallon ****");
        System.out.println("Miles driven (enter a positive number): ");
        double miles = input.nextDouble();
        System.out.println("Gallons consumed (enter a positive number): ");
        double gallons = input.nextDouble();

        double mpg = Math.round(miles / gallons * 100.0) / 100.0;

        System.out.println("Your fuel efficiency is " + mpg + "miles per gallon.");
    }
}
