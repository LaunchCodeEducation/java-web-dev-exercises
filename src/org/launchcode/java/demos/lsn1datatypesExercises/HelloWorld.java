package org.launchcode.java.demos.lsn1datatypesExercises;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name +"!");
    }
}
