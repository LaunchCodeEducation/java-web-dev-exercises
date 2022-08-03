package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius;
        if (input.hasNextDouble()) {
            radius = input.nextDouble();

            if (radius > 0) {
                Double circleArea = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + circleArea);

            } else {
                System.out.println("radius must be a positive number");
            }
        } else {
            System.out.println("radius must be a number");
        }

        input.close();

    }
}
