package exercises;
import java.util.Scanner;

public class Mileage {
    public static void main(String[] args){

        double miles;
        double gallon;
        double mileage;
        Scanner input1;
        Scanner input2;

        input1 = new Scanner(System.in);
        System.out.println("Enter the miles travelled:");
        miles = input1.nextDouble();
        input2 = new Scanner(System.in);
        System.out.println("Enter the gallons of fuel filled :");
        gallon=input1.nextDouble();
        input1.close();
        input2.close();

        mileage=miles/gallon;
        System.out.println("The Mileage of travel: "+ mileage+"m/g ");



    }
}
