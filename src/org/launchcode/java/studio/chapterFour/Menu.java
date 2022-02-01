package org.launchcode.java.studio.chapterFour;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    protected ArrayList<MenuItem> items = new ArrayList<>();
    private Date lastUpdated = new Date();

    protected ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem (MenuItem item) {
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public Menu() {

    }

    public Menu(ArrayList<MenuItem> items) {
        if (items.size() > 0) {
            for (MenuItem e : items) {
                System.out.println(e.itemInfo());
            }
            System.out.println("Menu Updated: " + this.lastUpdated);
        } else {
            System.out.println("No Result");
        }
    }
}
