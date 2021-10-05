package org.launchcode.java.studios.restaurantmenu;

import java.util.Objects;

public class MenuItem {
    private String itemName;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String itemName, String description, double price, String category, boolean isNew) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String itemName, String description, double price, String category) {
        this(itemName, description, price, category, true);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && Objects.equals(itemName, menuItem.itemName) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, description, price, category);
    }
}
