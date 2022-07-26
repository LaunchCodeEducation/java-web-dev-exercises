package org.launchcode.java.studios.RestaurantMenu;

public class MenuItem {

    private String name;

    private String category;

    private Integer price;

    private Boolean newItem;


    public MenuItem (String name, String category, int price, Boolean newItem){
        this.name = name;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
