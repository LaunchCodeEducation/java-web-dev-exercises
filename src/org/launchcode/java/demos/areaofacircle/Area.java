package areaofacircle;
import java.util.Scanner;
//Working on Bonus ... need to catch and throw error

public class Area {
    public static void main(String[] args) {
        Double radius;
        Scanner inputRadius;
        Double area;

        // Find the area of a circle using input of radius
        inputRadius = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        radius = 0.0;
        boolean error = false;
        try {
            radius = inputRadius.nextDouble();

        } catch (Exception e) {
            error = true;
            System.out.println("Radius value is not a number.");
        }

        inputRadius.close();
        if (error == false) {
            if (radius < 0) {
                System.out.println("Radius value of " + radius + " is incorrect.");
            } else {
                //        area = (3.14 * radius * radius);
                // area = Math.PI * Math.pow(radius,2);
                area = Circle.getArea(radius);
                System.out.println("The area of the circle of radius " + radius + " is: " + area);
            }
        }
               /* Bonus a. validation negative number;
                     b. non-numeric character
                     c. empty string
                     d. If either, print error message and quit
            */

//        if (radius.isNaN()) {
//            System.out.println("Radius value of " + radius + " is not a number.");



// close the Scanner to prevent unintended access
    }
}
