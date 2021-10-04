package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        // create items
        MenuItem caesarSalad = new MenuItem("Caesar Salad", "A traditional salad", 7.99, "Appetizer");
        MenuItem avocadoToast = new MenuItem("Avocado Toast", "A CA favorite", 18.99, "Entree", false);
        MenuItem tiramisu = new MenuItem("Tiramisu", "Coffee-flavored dessert", 4.99, "Dessert");
        MenuItem test = new MenuItem("test", "test", 4.99, "test");

        // add items to ArrayList
        menuItems.add(caesarSalad);
        menuItems.add(avocadoToast);
        menuItems.add(tiramisu);

        // add ArrayList to menu along with current date
        Date date = new Date();
        Menu ourMenu = new Menu(date, menuItems);

        // add a single item
        ourMenu.addMenuItems(test);

        // print menu
        System.out.println("Printing original menu...");
        System.out.println(ourMenu);

        // remove item
        ourMenu.removeItems(test);

        // print menu
        System.out.println("Printing menu with removed item...");
        System.out.println(ourMenu);

        // print single item
        System.out.println("Printing single menu item...");
        System.out.println(ourMenu.toString(avocadoToast));
    }
}
