package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    private ArrayList<MenuItem> items;

    private Date lastUpdated;





    public Menu(ArrayList<MenuItem> items) {
        this.items = items;

    }

    public ArrayList<MenuItem> menuAddItem(MenuItem item) {
        this.items.add(item);
        return items;
    }

    static Date getDate() {
            return new Date();
        }

}
