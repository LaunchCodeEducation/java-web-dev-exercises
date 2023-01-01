package org.launchcode.java.demos.lsn1datatypesExercises;
import java.util.Scanner;


public class CalculateGas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nLet's calculate your miles per gallon!\n\nHow many gallons of gas are in your tank?");
        double capac = input.nextDouble();
        System.out.println("How many miles can you drive with a full tank of gas?");
        double miles = input.nextDouble();
        input.close();
        double mpg = Math.round(miles/capac*10)/10;
        System.out.println("Your car has " + mpg + " mpg");
    }
}
