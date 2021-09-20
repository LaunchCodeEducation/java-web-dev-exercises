package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        Double radius = input.nextDouble();
//        System.out.println("initialize radius");
        Double area = Circle.getArea(radius);
//        System.out.println("get area");
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
