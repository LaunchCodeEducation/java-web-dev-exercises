package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;
        double area = 0;

        // Prompt
        System.out.println("Enter the radius of your circle : ");

        String input = scanner.nextLine();
        if(input.isEmpty()) {
            System.out.println("Error: radius cannot be empty!");
            System.exit(1);
        }
        double radius = Double.parseDouble(input);
        if (radius < 0) {
            System.out.println("Error: radius cannot be negative!");
            System.exit(1);
        }

        // Calc and Output
        area = PI * (Math.pow(radius,2));
        System.out.println("The area of your circle is: " + area);

    }
}
