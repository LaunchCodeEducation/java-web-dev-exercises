package org.launchcode.java.studios.menu;
import java.util.*;

public class MenuItem {
    String name;
    private double price;
    private String description;
    private String category;
    private String dateAdded;

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory, String aDateAdded){
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.dateAdded = aDateAdded;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String theName){
        this.name = theName;
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

    public String getDateAdded(){
        return this.dateAdded;
    }

    public void setDateAdded(String theDate){
        this.dateAdded = theDate;
    }
}
