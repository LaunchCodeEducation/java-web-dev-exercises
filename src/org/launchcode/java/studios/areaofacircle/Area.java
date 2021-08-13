package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        double areaOfCircle = Math.pow(radius, 2) * Math.PI;
        areaOfCircle = Math.round(areaOfCircle * 100.0) / 100.0;
        System.out.println("The are of a circle of radius " + radius + " is:" + areaOfCircle);
    }
}
