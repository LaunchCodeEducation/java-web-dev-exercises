package exercises.chap2;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        // instance vars
        Scanner input = new Scanner(System.in);

        // Prompt user question
        System.out.println("Hello, what is your name?: ");
        // Store answer
        String name = input.nextLine();
        // Return
        System.out.println("Hello " + name);
    }
}
