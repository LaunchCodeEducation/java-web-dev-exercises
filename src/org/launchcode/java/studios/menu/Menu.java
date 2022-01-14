package org.launchcode.java.studios.menu;
import java.util.*;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
    }

    public void addItem(String aName, double aPrice, String aDescription, String aCategory){
        menuItems.add(new MenuItem(aName, aPrice, aDescription, aCategory));
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> theMenuItems){

        this.menuItems = theMenuItems;
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdatedDate){
        this.lastUpdated = lastUpdatedDate;
    }
}
