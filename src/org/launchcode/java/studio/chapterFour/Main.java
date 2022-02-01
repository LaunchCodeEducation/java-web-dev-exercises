package org.launchcode.java.studio.chapterFour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MenuItem itemOne = new MenuItem("Fries", 1.99, "A pack of french fries", "Sides", true);
        MenuItem itemTwo = new MenuItem("Beans", 0.99, "A pack of beans", "Sides", true);
        MenuItem itemThree = new MenuItem("Mashed Potatoes", 2.99, "A pack of mashed potatoes", "Sides", true);
        MenuItem itemFour = new MenuItem("Steak", 4.99, "A good frilled steak", "Meal", true);
        MenuItem itemFive = new MenuItem("Chicken", 3.99, "4 pieces chicken", "Meal", true);

        Menu menu = new Menu();
        menu.addItem(itemOne);
        menu.addItem(itemTwo);
        menu.addItem(itemThree);
        menu.addItem(itemFour);
        menu.addItem(itemFive);
        ArrayList<MenuItem> list = menu.getItems();

        new Menu(list);

    }
}
