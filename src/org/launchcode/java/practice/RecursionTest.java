package org.launchcode.java.practice;

import java.util.Scanner;

public class RecursionTest {
    private static int total = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = input.nextInt();
        sum(number);
    }

    public static void sum (int n) {
        // Base case when n will be 0
        if (n == 0) {
            System.out.println("Total: " + total);
        } else {
            System.out.print(n + " + " + total + " = ");
            total += n;
            System.out.println(total);
            n--;
            sum(n);
        }
    }
}
