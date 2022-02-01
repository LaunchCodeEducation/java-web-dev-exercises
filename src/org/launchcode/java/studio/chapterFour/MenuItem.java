package org.launchcode.java.studio.chapterFour;

import java.util.Objects;

public class MenuItem {
    private static int id = 1;
    private int originalId;
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(int id, String name, double price, String description, String category, boolean isNew) {
        this.originalId = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this(id, name, price, description, category,isNew);
        id++;
    }

    public String itemInfo() {
        return "id: " + this.id + "; Name: " + this.name + "; Price: " + this.price + ".";
    }
}