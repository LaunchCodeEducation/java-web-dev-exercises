package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        double areaOfCircle = Circle.getArea(radius);
        String printStatement = "The area of a circle of radius " + radius + " is: " + areaOfCircle;
        System.out.println(printStatement);
    }
}