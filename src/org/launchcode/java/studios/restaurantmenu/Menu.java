package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(Date lastUpdated, ArrayList<MenuItem> menuItems) {
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItems(MenuItem item) {
        this.menuItems.add(item);
    }

    public void removeItems(MenuItem item) {
        if (this.menuItems.contains(item)) {
            this.menuItems.remove(item);
        } else {
            System.out.println("Item is not in the menu");
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (MenuItem i : this.getMenuItems()) {
            output += "Item name: " + i.getItemName() + ". Description: " + i.getDescription() + ". Category: " + i.getCategory() + ". Price: " + i.getPrice() + "\n";
        }
        output += "Last updated: " + this.lastUpdated +"\n";
        return output;
    }

    public String toString(MenuItem i) {
        return "Item name: " + i.getItemName() + ". Description: " + i.getDescription() + ". Category: " + i.getCategory() + ". Price: " + i.getPrice();
    }
}
