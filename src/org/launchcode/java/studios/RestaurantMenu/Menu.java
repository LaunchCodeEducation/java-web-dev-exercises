package org.launchcode.java.studios.RestaurantMenu;

import java.time.Month;
import java.time.MonthDay;
import java.util.Date;


public class Menu {


    public static void main(String[] args) {



        MenuItem fries = new MenuItem("fries", "appetizers", 4, false);
        MenuItem burger = new MenuItem("burger", "main course", 5, true);
        MenuItem cake = new MenuItem("cake", "dessert", 4, false);

        System.out.println("Name: " + fries.getName() + " Price: " + fries.getPrice() + " New Item: " + fries.getNewItem());

        System.out.println("This menu was updated: " + new Date());
    }
}
