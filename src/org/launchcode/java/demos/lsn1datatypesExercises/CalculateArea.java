package org.launchcode.java.demos.lsn1datatypesExercises;
import java.util.Scanner;
public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the area of a rectangle!");
        System.out.println("What is the length of your rectangle?");
        double l = input.nextDouble();
        System.out.println("What is the width of your rectangle?");
        double w = input.nextDouble();
        input.close();
        double area = l*w;
        System.out.println("The area of your rectangle is " + area + "cm^2");
    }
}
