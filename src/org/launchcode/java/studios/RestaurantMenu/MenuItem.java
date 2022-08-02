package org.launchcode.java.studios.RestaurantMenu;

import java.util.Objects;

public class MenuItem {

    private int nextId = 1;

    private String name;

    private final int id;

    private String description;

    private String category;

    private Integer price;

    private Boolean newItem;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return getId() == menuItem.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public MenuItem (String name, String description, String category, int price, Boolean newItem){
        this.id = nextId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
        nextId++;
    }

    public MenuItem (String name, String description, String category, int price) {
        this.id = nextId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        nextId++;
    }


    public int getId() { return nextId;}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}


