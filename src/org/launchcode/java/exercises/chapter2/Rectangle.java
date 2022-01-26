package org.launchcode.java.exercises.chapter2;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner inputLength = new Scanner(System.in);

        System.out.print("Type the length of the rectangle: ");
        double length = inputLength.nextDouble();

        Scanner inputWidth = new Scanner(System.in);

        System.out.print("Type the width of the rectangle: ");
        double width = inputWidth.nextDouble();

        double total = length * width;

        System.out.println("The area of the rectangle is: " + total);
    }
}
