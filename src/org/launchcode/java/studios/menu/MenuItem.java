package org.launchcode.java.studios.menu;
import java.util.*;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory){
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.dateAdded = new Date();
    }

    public String toString(){
        return "Item Name: " + getName() + "\nDescription: " + getDescription() + "\nCategory: " + getCategory() + "\nPrice: " + getPrice() + "\n";

       /* if (getDateAdded().equals(getLastUpdated())) {
            System.out.println("***NEW ITEM***");
        }

        */
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double thePrice){
        this.price = thePrice;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String theDescription){
        this.description = theDescription;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String theCategory){
        this.category = theCategory;
    }

    public Date getDateAdded(){
        return this.dateAdded;
    }

    public void setDateAdded(Date theDate){
        this.dateAdded = theDate;
    }
}
