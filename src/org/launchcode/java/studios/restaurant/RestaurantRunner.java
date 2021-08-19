package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantRunner {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItemsArrayList = testMenuItem();
        MenuItem bibimbab = new MenuItem(12.8, "Dolsot bibimbab with tofu", "main course");
        System.out.println("*** Test menu output ***");
        Menu aMenu = testMenu(menuItemsArrayList);
        aMenu.addMenuItem(bibimbab);
        System.out.println("\n *** Updated menu - add bibimbab ***");
        aMenu.printMenu();
        aMenu.removeMenuItem(bibimbab);
        System.out.println("\n *** Updated menu - remove bibimbab");
        aMenu.printMenu();
    }

    protected static ArrayList<MenuItem> testMenuItem() {
        MenuItem mooshu = new MenuItem(13.2, "Mooshu pork", "main course");
        MenuItem pho = new MenuItem(9.3, "Pho", "main course");
        MenuItem bubbleTea = new MenuItem(5.2, "Milk tea with tapioca pearls", "dessert");
        MenuItem satay = new MenuItem(6.3, "Chicken satay", "appetizer");

        ArrayList<MenuItem> newItemsArrayList = new ArrayList<>(
                Arrays.asList(mooshu, pho, bubbleTea, satay)
        );

        return newItemsArrayList;
    }

    protected static Menu testMenu(ArrayList<MenuItem> aMenuItemsArrayList) {
        Menu newMenu = new Menu();

        System.out.println("Menu was last updated: " + newMenu.getLastUpdate() + "\n");
        newMenu.setMenuOfItems(aMenuItemsArrayList);
        newMenu.printMenu();

        return newMenu;
    }
}
