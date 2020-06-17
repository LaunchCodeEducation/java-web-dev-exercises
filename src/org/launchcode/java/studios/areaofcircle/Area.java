package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
     //double radius;
        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");


        while(input.hasNext()){
            try{
            radius = input.nextDouble();
                if( radius < 0 ){
                    System.out.println("please enter positive number");
                    break;
                } else if (radius > 0 ) {
                    System.out.println("The area of circle of radius " + radius + " is: " + Circle.getArea(radius));
                    break;
                }
            }
            catch(Exception e){
                   System.out.println("Invalid input, Please use only number");
                break;
            }
            System.out.println("Please enter some number [1-9]");


        }
        input.close();
    }

}


