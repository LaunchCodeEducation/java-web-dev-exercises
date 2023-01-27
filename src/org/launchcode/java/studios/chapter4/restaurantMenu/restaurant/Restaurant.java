package org.launchcode.java.studios.chapter4.restaurantMenu.restaurant;

import java.util.*;

public class Restaurant {
    public static void main (String[] args) {
        // print items
        System.out.println("Our Restaurant Menu\n- - - - - - - - - - ");
        Menu currentMenu = new Menu();

        System.out.println("Entres");
        currentMenu.entres();
        System.out.println(currentMenu.getEntres());

        System.out.println("Drinks");
        currentMenu.drinks();
        System.out.println(currentMenu.getDrinks());

        System.out.println("Dressings");
        currentMenu.dressing();
        System.out.println(currentMenu.getDressings());
    }
}
