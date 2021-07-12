package studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        input.close();
        double area = 3.14 * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
