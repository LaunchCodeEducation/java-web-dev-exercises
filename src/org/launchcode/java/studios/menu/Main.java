package org.launchcode.java.studios.menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Menu theMenu = new Menu();

        theMenu.addItem("Pancake and Eggs", 19.99, "3 Buttermilk Pancakes and 2 Eggs with Bacon", "Breakfast");
        theMenu.addItem("Cheeseburger",29.99, "1 Patty Cheeseburger with American cheese and a side of fries", "Dinner");

        for(MenuItem indieItem: theMenu.getMenuItems()){
            System.out.println("Item Name: " + indieItem.getName());
            System.out.println("Description: " + indieItem.getDescription());
            System.out.println("Category: " + indieItem.getCategory());
            System.out.println("Price: " + indieItem.getPrice());

            if(indieItem.getDateAdded().equals(theMenu.getLastUpdated())) {
                System.out.println("***NEW ITEM***");
            }

            System.out.println("\n");
        }
    }
}
