package org.launchcode.java.demos.javawebdevelopment;

import java.util.Scanner;

/**
 * From "Java Web Development"
 */
public class TempConv {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println("The temperature in Celsius is: " + celsius + " degrees.");
    }

}
