package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Boolean;
import java.lang.Math;

public class Area {
    public static void main(String[] args) throws InputMismatchException {
//        Notes:
//        Scanner scanny = new Scanner(System.in);
//        System.out.print("What's your favorite number? ");
//        int favoriteNumber = scanny.nextInt();
//        if(favoriteNumber % 2 == 1) {
//            System.out.println("Odd number!");
//        } else {
//            System.out.println("Even number!");
//        }
//        System.out.println("Hello World!");
        Scanner scanny = new Scanner(System.in);
        System.out.print("What's your radius: ");
        double radius = scanny.nextDouble();

        while (radius < 0) {
            System.out.print("What's your radius: ");
            radius = scanny.nextDouble();
        }

//        boolean cont = true;
////
//        do {
//            try {
//                cont = false;
//            } catch (InputMismatchException e) {
//                cont = true;
//                System.out.print("What's your radius: ");
//                radius = scanny.nextDouble();
//            }
//        }while (cont);


//        try {
//            while (radius < 0) {
//                System.out.print("What's your radius: ");
//                radius = scanny.nextDouble();
//            }
//        } catch (InputMismatchException e) {
//            System.out.print("What's your radius: ");
//            radius = scanny.nextDouble();
//        }


//        double area = Math.PI * Math.pow(radius, radius);
//        System.out.println(area);
        double area = Circle.getArea(radius);
        System.out.println(area);
    }
}
