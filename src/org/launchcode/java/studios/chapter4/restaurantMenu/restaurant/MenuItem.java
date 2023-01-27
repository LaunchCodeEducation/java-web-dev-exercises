package org.launchcode.java.studios.chapter4.restaurantMenu.restaurant;

public class MenuItem {
    private String itemName;
    private double itemPrice;

    // setter
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double price) {
        this.itemPrice = price;
    }

    // getter
    public String getItemName() {
        return this.itemName;
    }

    public double getItemprice() {
        return this.itemPrice;
    }
}
