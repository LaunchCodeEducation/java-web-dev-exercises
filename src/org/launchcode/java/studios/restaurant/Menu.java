package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Menu {
    private String restaurantName;
    private Calendar lastUpdated;
    private Integer numberOfItems;
    private String chef;
    private String restaurantDescription;
    private String restaurantHours;
    private ArrayList<MenuItem> menuItemList = new ArrayList<>();




    public Menu(String restaurantName, Calendar lastUpdated, Integer numberOfItems, String chef, String restaurantDescription, String restaurantHours) {
        this.restaurantName = restaurantName;
        this.lastUpdated = lastUpdated;
        this.numberOfItems = numberOfItems;
        this.chef = chef;
        this.restaurantDescription = restaurantDescription;
        this.restaurantHours = restaurantHours;
    }

    void newMenuItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the menu item.");
        String aName = input.nextLine();
        System.out.println("Please enter the price of the menu item.");
        Double aPrice = input.nextDouble();
        System.out.println("Please enter the description of the menu item.");
        input.nextLine();
        String aDescription = input.nextLine();
        System.out.println("Please enter the category (entree, appetizer, etc.) of the menu item.");
        String aCategory = input.nextLine();
        MenuItem item = new MenuItem(aName, aPrice, aDescription, aCategory, true);
        if (menuItemList.contains(item)) {
            System.out.println("Menu item already exists. Please enter a new item.");
            newMenuItem();
        }
        menuItemList.add(item);
        this.lastUpdated = Calendar.getInstance();
        System.out.println("Menu item has been created!");
        String[] stringArray = {"menu item created", "return to main menu"};
        Restaurant.main(stringArray);
    }

    void printMenuItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the item you'd like to print.");
        String itemNameToPrint = input.next();
        for (MenuItem menuItem : menuItemList) {
            if (menuItem.getName().equals(itemNameToPrint)) {
                System.out.println("Name: " + menuItem.getName() + "\nPrice: " +
                        menuItem.getPrice() + "\nDescription: "
                        + menuItem.getDescription() + "\n Category: " +
                        menuItem.getCategory() + "\nNew item!");
            }
        }
        Restaurant.main(new String[]{"menu item printed", "return to main menu"});
    }


    void updateMenuItem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please state the name of the menu item you'd like to change.");
        input.nextLine();
        String aName = input.nextLine();
        boolean isInList = false;
        for (MenuItem i : menuItemList) {
            if (aName.equals(i.getName())) {
                isInList = true;
                System.out.println("What property would you like to change about item " + aName + " ?" +
                        " If you'd like to delete the item, enter 'delete'.");
                String property = input.next();
                if (property.toLowerCase().equals("delete")) {
                    System.out.println("Are you sure you want to delete item + " + aName + "? Enter 'yes' or 'no'.");
                    if (input.next().toLowerCase().equals("yes")) {
                        menuItemList.remove(i);
                    }
                }
                System.out.println("Please type the new " + property + " of item " + aName + ".");
                if (property.toLowerCase().equals("price")) {
                    Double value = input.nextDouble();
                    i.setPrice(value);
                } else if (property.toLowerCase().equals("isnew")) {
                    Boolean value = input.nextBoolean();
                    i.setNew(value);
                } else if (property.toLowerCase().equals("name")) {
                    String value = input.nextLine();
                    i.setName(value);
                } else if (property.toLowerCase().equals("description")) {
                    String value = input.nextLine();
                    i.setDescription(value);
                } else if (property.toLowerCase().equals("category")) {
                    String value = input.nextLine();
                    i.setCategory(value);
                } else {
//                    System.out.println("Menu item does not have such a property, would you like to add it? If so, enter 'add'.");
//                    if (input.next().toLowerCase().equals("add")) {
//                        System.out.println("Please enter the value of this new property one more time.");
//                        String value = input.next();
//                        i.property = value;
//                    }
                    System.out.println("Menu item does not have this property. To return to the main menu, enter 'main'.");
                    if (input.next().toLowerCase().equals("main")) {
                        Restaurant.main(new String[] {"return to main"});
                    }
                    else {
                        updateMenuItem();
                    }
                }
                this.lastUpdated = Calendar.getInstance();
                System.out.println("Item " + aName + "'s property " + property + " has been changed! " +
                        "To return to the main menu, enter 'main'. To edit another existing item, enter 'edit'.");
                if (input.next().toLowerCase().equals("edit")) {
                    updateMenuItem();
                } else {
                    System.out.println("Would you like to print the entire menu? Enter 'yes'. Otherwise, you will be directed back to the main menu.");
                    if (input.next().toLowerCase().equals("yes")) {
                        printMenu();
                    }
                    Restaurant.main(new String[] {"return to main menu"});
                }
            }
        }
        if (!isInList) {
            System.out.println("The menu item is not currently on the menu. Would you like to add it? If so, enter 'new'.");
            if (input.next().toLowerCase().equals("new")) {
                newMenuItem();
            } else {
                updateMenuItem();
            }
        }
    }

    void printMenu() {
        System.out.println("" + this.restaurantName + "\nRestaurant Description: " + this.restaurantDescription +
                "\nHours of Operation: " + this.restaurantHours + "\nChef: " + this.chef + "\nMenu was last updated on "
                + this.lastUpdated.MONTH + "/" + this.lastUpdated.DAY_OF_MONTH + "/" + this.lastUpdated.YEAR +
                "\nNumber of items on the menu: " + this.numberOfItems);
        for (MenuItem i : menuItemList) {
            System.out.println(i.getAll() + "\n");
        }
        Restaurant.main(new String[] {"menu printed", "return to main menu"});
    }



}
