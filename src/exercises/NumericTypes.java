package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle: ");
    Integer length = input.nextInt();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter the width of the rectangle: ");
    Integer width = input2.nextInt();

    int rectangleArea = length * width;
    System.out.println("The area of the rectangle is " + rectangleArea);

    input.close();
    input2.close();

    }

}
