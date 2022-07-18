package exercises;

import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length;
        double width;
        double area;

        System.out.println("Enter the length of a rectangle: ");
        length = input.nextDouble();

        System.out.println("Enter the width of a rectangle: ");
        width = input.nextDouble();


        area = (length/width);
        System.out.println("The area of your rectangle is: " + area + "°A");

    }
}
