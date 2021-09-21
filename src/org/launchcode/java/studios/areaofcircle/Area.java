package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        boolean validRadius = false;
        while (!validRadius) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a radius:");
            try {
                double radius = input.nextDouble();
                if (radius > 0) {
                    Double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    validRadius = true;
                } else {
                    System.out.println("Cannot use a negative radius");
                }
            } catch (Exception e) {
                System.out.println("Invalid radius, must be a positive number");
            }
        }
    }
}
