package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;


    public MenuItem(String name, Double price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew  = isNew;
    }

    public MenuItem() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    protected void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    protected void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public HashMap getAll() {
        String priceInfo = "" + price;
        String isNewInfo = "" + isNew;
        HashMap<String, String> menuItem = new HashMap<String, String>();
        menuItem.put("name", name);
        menuItem.put("price", priceInfo);
        menuItem.put("description", description);
        menuItem.put("category", category);
        menuItem.put("is new:", isNewInfo);
        return menuItem;
    }
}
