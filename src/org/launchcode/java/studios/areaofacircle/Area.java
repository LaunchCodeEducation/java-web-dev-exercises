package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is :" + area);
    }
}
