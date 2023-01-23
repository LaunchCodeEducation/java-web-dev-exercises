package org.launchcode.java.studios.chapter4.restaurantMenu.restaurant;

import java.util.*;


public class Menu {
    public static void main (String[] args) {
        ArrayList<MenuItem> menuList = new ArrayList<>();

        // create instances of MenuItem
        MenuItem item1 = new MenuItem();
        item1.setItemName("Cheese Pizza");
        item1.setItemPrice(10.00);
        MenuItem item2 = new MenuItem();
        item2.setItemName("Bacon Topped Pizza");
        item2.setItemPrice(12.50);
        MenuItem item3 = new MenuItem();
        item3.setItemName("Side of Ranch");
        item3.setItemPrice(0.75);

        // add items to AL
        menuList.add(item1);
        menuList.add(item2);
        menuList.add(item3);

        // print items
        System.out.println("Our menu contains\n- - - - - - - - - - ");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println("Item " + (i + 1) + " is : " + menuList.get(i).getItemName() + " $" + menuList.get(i).getItemprice());
        }
    }
}
