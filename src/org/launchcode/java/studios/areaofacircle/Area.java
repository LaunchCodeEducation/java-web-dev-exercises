package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        double radiusInput;

        do{
            if(!input.hasNextDouble()){
                System.out.println("Invalid input!");
                System.exit(0);
            }

            radiusInput = input.nextDouble();

            if(radiusInput <= 0){
                System.out.println("Enter a number above 0: ");
            }
        } while(radiusInput <= 0);

        input.close();

        System.out.println("The area of a circle with a radius of " + radiusInput + " is: " + Circle.getArea(radiusInput));
    }
}
