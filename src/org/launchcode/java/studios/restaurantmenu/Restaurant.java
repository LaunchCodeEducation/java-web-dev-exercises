package org.launchcode.java.studios.restaurantmenu;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        // create items
        MenuItem caesarSalad = new MenuItem("Caesar Salad", "A traditional salad", 7.99, "Appetizer");
        MenuItem avocadoToast = new MenuItem("Avocado Toast", "A CA favorite", 18.99, "Entree", false);
        MenuItem tiramisu = new MenuItem("Tiramisu", "Coffee-flavored dessert", 4.99, "Dessert");
        MenuItem test = new MenuItem("test", "test", 4.99, "test");
        MenuItem avocadoToast2 = new MenuItem("Avocado Toast", "A CA favorite", 18.99, "Entree", false);


        // add items to ArrayList
        menuItems.add(caesarSalad);
        menuItems.add(avocadoToast);
        menuItems.add(tiramisu);

        // add ArrayList to menu along with current date
        Date date = new Date();
        Menu ourMenu = new Menu(date, menuItems);

        // add a single item
        ourMenu.addMenuItems(test, new Date());

        // print menu
        System.out.println("Printing original menu...");
        System.out.println(ourMenu);

        // remove item
        ourMenu.removeItems(test, new Date());

        // print menu
        System.out.println("Printing menu with removed item...");
        System.out.println(ourMenu);

        // print single item
        System.out.println("Printing single menu item...");
        System.out.println(ourMenu.toString(avocadoToast));

        // this is just to test if the timestamp function works properly
//        boolean stayInLoop = true;
//        while (stayInLoop) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter any string to print menu or 'x' to exit");
//            String userChoice = input.nextLine();
//            if (userChoice == "x") {
//                stayInLoop = false;
//            } else {
//                System.out.println(ourMenu);
//            }
//        }

        // check if two menu items are equal
        MenuItem a = avocadoToast;
        MenuItem b = avocadoToast2;
        MenuItem c = tiramisu;
        System.out.println("Check if custom equals function works properly..." );
        if (a.equals(b)) {
            System.out.println(a.getItemName() + " is the same as " + b.getItemName() + "\n");
        } else {
            System.out.println(a.getItemName() + " is not the same as " + b.getItemName() + "\n");
        }

        System.out.println("Check if custom equals function works properly..." );
        if (a.equals(c)) {
            System.out.println(a.getItemName() + " is the same as " + c.getItemName() + "\n");
        } else {
            System.out.println(a.getItemName() + " is not the same as " + c.getItemName() + "\n");
        }

        // check if item is new
        System.out.println("Checking if a given item is new... ");
        System.out.println("Item '" + tiramisu.getItemName() + "' is new? " + tiramisu.isNew() + "\n");

        // prevent user from adding an existing menu item
        System.out.println("Trying to add existing item...");
        ourMenu.addMenuItems(avocadoToast2, new Date());
        System.out.println("Print menu to prove that avocadoToast2 was not added...");
        System.out.println(ourMenu);
    }
}
