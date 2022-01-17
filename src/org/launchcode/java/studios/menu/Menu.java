package org.launchcode.java.studios.menu;
import java.util.*;
import java.util.Date;

public class Menu {
    private HashMap<String, MenuItem> menuItems = new HashMap<>();
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
    }

    public void printMenu(HashMap<String, MenuItem> theMenuItems){
        for (Map.Entry<String, MenuItem> indieItem : theMenuItems.entrySet()) {
            System.out.println(indieItem.getValue());
        }
    }

    public void addItem(String aName, double aPrice, String aDescription, String aCategory){
        menuItems.put(aName.toLowerCase(), new MenuItem(aName, aPrice, aDescription, aCategory));
    }

    public void removeItem(String aName){
        if(this.menuItems.get(aName) != null ) {
            this.menuItems.remove(aName);
        }
    }

    public HashMap<String, MenuItem> getMenuItems(){
        return this.menuItems;
    }


    public HashMap<String, MenuItem> getMenuItems(String item){
        item = item.toLowerCase();

        if(this.menuItems.get(item) != null ){
            HashMap<String, MenuItem> returnSingle = new HashMap<String, MenuItem>();
            returnSingle.put(item, this.menuItems.get(item));

            return returnSingle;
        } else {
            return null;
        }
    }

    public void setMenuItems(HashMap<String, MenuItem>theMenuItems){

        this.menuItems = theMenuItems;
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdatedDate){
        this.lastUpdated = lastUpdatedDate;
    }
}
