package exercises;

import java.util.Scanner;

public class L02_4_2_2_Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give me the width and length of a rectangle and I will give you its area.");
        System.out.println("Length (enter a positive number): ");
        double length = input.nextDouble();
        System.out.println("Width (enter a positive number): ");
        double width = input.nextDouble();
        double area = Math.round(length * width * 100.0) / 100.0;
        System.out.println("The rectangle's area is " + area + ".");
    }
}
