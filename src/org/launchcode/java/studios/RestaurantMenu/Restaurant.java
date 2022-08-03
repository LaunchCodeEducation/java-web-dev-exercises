package org.launchcode.java.studios.RestaurantMenu;
import java.util.ArrayList;
import java.util.Date;

import static org.launchcode.java.studios.RestaurantMenu.Menu.getDate;


public class Restaurant {

    public static void main(String[] args) {

        ArrayList<MenuItem> myBucket = new ArrayList<>();

    MenuItem baconBrusselsSprouts = new MenuItem("Bacon-wrapped Brussels Sprouts", "They're wrapped in bacon", "Appetizer", 15);
    MenuItem BLT = new MenuItem("BLT", "bacon, lettuce and tomato", "MainCourse", 10);

    myBucket.add(baconBrusselsSprouts);
    myBucket.add(BLT);
//        System.out.println("Name: " + fries.getName() + " Price: " + fries.getPrice() + " New Item: " + fries.getNewItem());
        
        System.out.println("This menu was updated: " + getDate());
    }
    }
