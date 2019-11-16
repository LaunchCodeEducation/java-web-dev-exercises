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
    private static ArrayList<MenuItem> menuItemList = new ArrayList<>();
    private static Menu menu;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Main menu: Please enter the basic properties of your menu. If you already have a menu, enter 'update menu'. Otherwise, enter any key.");
        if (!(input.next().toLowerCase().equals("update menu"))) {
            updateMenuItem();
        }
        System.out.println("Do you want to add a new menu item? If so, enter 'new'.");
        if (input.next().toLowerCase().equals("new")) {
            newMenuItem();
            System.out.println("To see one of your menu items, enter 'print item'. To add another item, enter 'new item'.");
            if (input.next().toLowerCase().equals("print item")) {
                printMenuItem();
            } else if (input.next().toLowerCase().equals("new item")) {
                newMenuItem();
            }
        } else {
            System.out.println("Would you like to update an existing menu item? If so, enter 'update'.");
            if (input.nextLine().toLowerCase().equals("update")) {
                updateMenuItem();
            }
        }
        System.out.println("Would you like to print out your entire menu? If so, enter 'print'.");
        if (input.next().toLowerCase().equals("print")) {
            printMenu();
        } else {
            main(new String[] {"return to main menu"});
        }
    }

    private Menu(String restaurantName, Calendar lastUpdated, Integer numberOfItems, String chef, String restaurantDescription, String restaurantHours) {
        this.restaurantName = restaurantName;
        this.lastUpdated = lastUpdated;
        this.numberOfItems = numberOfItems;
        this.chef = chef;
        this.restaurantDescription = restaurantDescription;
        this.restaurantHours = restaurantHours;
    }

    private static void newMenuItem() {
//        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the menu item.");
        input.nextLine();
        String aName = input.nextLine();
        System.out.println("Please enter the price of the menu item.");
        Double aPrice = input.nextDouble();
        System.out.println("Please enter the description of the menu item.");
        input.nextLine();
        String aDescription = input.nextLine();
        System.out.println("Please enter the category (entree, appetizer, etc.) of the menu item.");
        String aCategory = input.nextLine();
        MenuItem item = new MenuItem(aName, aPrice, aDescription, aCategory, true);
        menuItemList.add(item);
        System.out.println("Menu item has been created!");
        String[] stringArray = {"menu item created", "return to main menu"};
        main(stringArray);
    }

    private static void printMenuItem() {
//        Scanner input = new Scanner(System.in);
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
        main(new String[]{"menu item printed", "return to main menu"});
    }


    private static void updateMenuItem() {
//        Scanner input = new Scanner(System.in);
        System.out.print("Please state the name of the menu item you'd like to change.");
        input.nextLine();
        String aName = input.nextLine();
        boolean isInList = false;
        for (MenuItem i : menuItemList) {
            if (aName.equals(i.getName())) {
                isInList = true;
                System.out.println("What property would you like to change about item " + aName + " ?");
                String property = input.next();
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
                        main(new String[] {"return to main"});
                    }
                    else {
                        updateMenuItem();
                    }
                }
                System.out.println("Item " + aName + "'s property " + property + " has been changed! " +
                        "To return to the main menu, enter 'main'. To edit another existing item, enter 'edit'.");
                if (input.next().toLowerCase().equals("edit")) {
                    updateMenuItem();
                } else {
                    System.out.println("Would you like to print the entire menu? Enter 'yes'. Otherwise, you will be directed back to the main menu.");
                    if (input.next().toLowerCase().equals("yes")) {
                        printMenu();
                    }
                    main(new String[] {"return to main menu"});
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

    public static void printMenu() {
        System.out.println(menu);
        for (MenuItem i : menuItemList) {
            System.out.println(i.getAll());
        }
        main(new String[] {"menu printed", "return to main menu"});
    }

    public static void createMenu() {
//        Scanner input = new Scanner(System.in);
        System.out.println("First, what is the name of your restaurant?");
        input.nextLine();
        String nameOfRestaurant = input.nextLine();
        System.out.println("Who is the chef?");
        String nameOfChef = input.nextLine();
        System.out.println("Please provide a description of the restaurant.");
        String restaurantDescription = input.nextLine();
        System.out.println("How many items will be on the menu?");
        Integer numItems = input.nextInt();
        input.nextLine();
        System.out.println("What are the restaurant's hours of operation?");
        String restaurantHours = input.nextLine();
        Calendar lastUpdated = Calendar.getInstance();
        menu = new Menu(nameOfRestaurant, lastUpdated, numItems, nameOfChef, restaurantDescription, restaurantHours);
    }

}
