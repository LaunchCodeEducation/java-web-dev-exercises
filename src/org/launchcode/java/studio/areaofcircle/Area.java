package org.launchcode.java.studio.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean runLoop = true;
        double radius = 0;
        double area;

        while (runLoop) {
            try {
                System.out.println("Please type the radius of a circle: ");
                radius = input.nextDouble();
                if (radius < 0) {
                    System.err.println("Cannot be negative");
                    continue;
                }
                area = Circle.getCircle(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
                runLoop = false;
            } catch (Exception e) {
                System.err.println("Radius has to be a number");
                input.next();
            }
        }
        input.close();
    }
}
