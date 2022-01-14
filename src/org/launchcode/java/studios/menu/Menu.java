package org.launchcode.java.studios.menu;
import java.util.*;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private int menuItemCount;
    private String lastUpdated;

    public Menu(ArrayList<MenuItem> theMenuItems, int theMenuItemCount, String menuLastUpdated) {
        this.menuItems = theMenuItems;
        this.menuItemCount = theMenuItemCount;
        this.lastUpdated = menuLastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> theMenuItems){
        this.menuItems = theMenuItems;
    }

    public int getItemCount(){
        return this.menuItemCount;
    }

    public void setItemCount(){
        this.menuItemCount = this.menuItems.size();
    }

    public String getLastUpdated(){
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdatedDate){
        this.lastUpdated = lastUpdatedDate;
    }

    public static void main(String[] args){
        ArrayList<MenuItem> theMenuItems = new ArrayList<MenuItem>();

        theMenuItems.add(new MenuItem("Pancake and Eggs", 19.99, "3 Buttermilk Pancakes and 2 Eggs with Bacon", "Breakfast", "Today"));
        theMenuItems.add(new MenuItem("Cheeseburger",29.99, "1 Patty Cheeseburger with American cheese and a side of fries", "Dinner", "Yesterday"));

        Menu theMenu = new Menu(theMenuItems, theMenuItems.size(), "Today");

        for(MenuItem indieItem: theMenu.getMenuItems()){
            System.out.println("Item Name: " + indieItem.getName());
            System.out.println("Description: " + indieItem.getDescription());
            System.out.println("Category: " + indieItem.getCategory());
            System.out.println("Price: " + indieItem.getPrice());

            if(indieItem.getDateAdded().equals(theMenu.getLastUpdated())) {
                System.out.println("***NEW ITEM***");
            }

            System.out.println("\n");
        }
    }
}
