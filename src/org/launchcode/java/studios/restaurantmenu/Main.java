package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem caesarSalad = new MenuItem("Caesar Salad", "A traditional salad", 7.99, "Appetizer");
        MenuItem avocadoToast = new MenuItem("Avocado Toast", "A CA favorite", 18.99, "Entree", false);
        MenuItem tiramisu = new MenuItem("Tiramisu", "Coffee-flavored dessert", 4.99, "Dessert");

        menuItems.add(caesarSalad);
        menuItems.add(avocadoToast);
        menuItems.add(tiramisu);

        Date date = new Date();
        Menu ourMenu = new Menu(date, menuItems);

        ourMenu.addMenuItems(avocadoToast);
    }
}
