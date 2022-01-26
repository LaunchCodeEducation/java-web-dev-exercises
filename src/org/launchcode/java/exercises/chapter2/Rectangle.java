package org.launchcode.java.exercises.chapter2;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Type the width of the rectangle: ");
        double width = input.nextDouble();

        double total = length * width;

        System.out.println("The area of the rectangle is: " + total);

        input.close();
    }
}
