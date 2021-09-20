package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius = -1.00;
        while (radius < 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a radius:");
            try {
                radius = input.nextDouble();
                if (radius > 0) {
                    Double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                } else {
                    System.out.println("Cannot use a negative radius");
                }
            } catch (Exception e) {
                System.out.println("Invalid radius");
            }
        }
    }
}
