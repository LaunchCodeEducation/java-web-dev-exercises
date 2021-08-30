package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = -1;
        double areaOfCircle;

//        https://kodejava.org/how-do-i-validate-input-when-using-scanner/
        do {
            System.out.print("Enter a radius: ");
            while (!input.hasNextDouble()) {
                String invalidRadius = input.next();
                System.out.println("'" + invalidRadius + "'" + " is not a valid input.\n");
                System.out.print("Enter a radius: ");
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        input.close();

        areaOfCircle = Circle.getArea(radius);
        areaOfCircle = Math.round(areaOfCircle * 100.0) / 100.0;
        System.out.println("The are of a circle of radius " + radius + " is: " + areaOfCircle);
    }
}