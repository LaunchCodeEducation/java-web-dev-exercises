package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is :" + area); */

        Scanner input = new Scanner(System.in);
        Double radius;
        do {
            System.out.println("Please enter the radius of the circle in cm: ");
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid radius.");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius < 0);
        input.close();
        Double area = Circle.getArea(radius);


        System.out.println("The area of a circle with a radius of " + radius +"cm is " + area + " centimeters squared.");

    }
}
