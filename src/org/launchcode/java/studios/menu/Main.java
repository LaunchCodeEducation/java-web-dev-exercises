package org.launchcode.java.studios.menu;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String nLine = "\n";

        Scanner input = new Scanner(System.in);

        Menu theMenu = new Menu();

        theMenu.addItem("Pancake and Eggs", 19.99, "3 Buttermilk Pancakes and 2 Eggs with Bacon", "Breakfast");
        theMenu.addItem("Cheeseburger", 29.99, "1 Patty Cheeseburger with American cheese and a side of fries", "Dinner");
        theMenu.addItem("Tacos", 109.99, "1 Taco with ground beef and shredded lettuce", "Dinner");

        System.out.println("[STEP 1. PRINTING ENTIRE MENU]" + nLine);

        theMenu.printMenu(theMenu.getMenuItems());

        System.out.println("[STEP 2. PRINT SINGLE ENTRY] " + nLine + "Enter single item by name to print from list above: ");

        String searchItem = input.nextLine();

        System.out.println(nLine);

        theMenu.printMenu(theMenu.getMenuItems(searchItem));

        System.out.println("[STEP 3. PRINT SINGLE ENTRY]" + nLine + "Enter single item by name to delete from list above: ");

        theMenu.removeItem(input.nextLine());

        System.out.println(nLine);

        System.out.println("[STEP 4. PRINT MENU WITH DELETED ITEM]" + nLine);

        theMenu.printMenu(theMenu.getMenuItems());
    }
}
