package org.launchcode.java.studio.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type the radius of a circle: ");

        double radius = input.nextDouble();

        double area = Circle.getCircle((radius));
//        double PI = 3.14159;
//        double area = PI * radius * radius;

        System.out.print("The are of a circle of radius " + radius + " is: " + area);
    }
}
