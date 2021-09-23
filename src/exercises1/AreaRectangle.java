package exercises1;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?");
        Integer length = input.nextInt();
        System.out.println("What is the width?");
        Integer width = input.nextInt();
        System.out.println("The area is: " + length * width);
    }
}
