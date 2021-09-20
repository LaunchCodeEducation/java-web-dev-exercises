package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles?");
        Integer distance = input.nextInt();
        System.out.println("How much gas has been used?");
        Integer gas = input.nextInt();
        System.out.println("The MPG is: " + distance / gas);
    }
}
