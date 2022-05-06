package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Enter a radius ");
        Double radius = input.nextDouble();

        System.out.println(Circle.getArea(radius));
    }
}

