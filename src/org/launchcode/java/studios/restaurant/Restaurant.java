package org.launchcode.java.studios.restaurant;


import java.util.Calendar;
import java.util.Scanner;

public class Restaurant {
    private Menu menu;
    private String name;
    private String hours;
    private String location;
    private String owner;
    private Integer yearsInBusiness;

    public Restaurant (String name, String hours, String location, String owner, Integer yearsInBusiness) {
        this.hours = hours;
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.yearsInBusiness = yearsInBusiness;
    }

    public Restaurant (String name, String hours) {
        this(name, hours, "unknown", "unknown", null);
    }

    public Restaurant() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        System.out.println("Main menu: Please enter the properties of your restaurant. If you already have a restaurant, please enter 'menu'. Otherwise, enter any key.");
        if (!(input.nextLine().toLowerCase().equals("menu"))) {
            restaurant.restaurantConstruction();
        }
        System.out.println("Please enter the basic properties of your menu. If you already have a menu, enter 'update menu'. Otherwise, enter any key.");
        if (!(input.nextLine().toLowerCase().equals("update menu"))) {
            restaurant.createMenu();
        }
        System.out.println("Do you want to add a new menu item? If so, enter 'new'.");
        if (input.next().toLowerCase().equals("new")) {
            restaurant.menu.newMenuItem();
            System.out.println("To see one of your menu items, enter 'print item'. To add another item, enter 'new item'.");
            if (input.next().toLowerCase().equals("print item")) {
                restaurant.menu.printMenuItem();
            } else if (input.next().toLowerCase().equals("new item")) {
                restaurant.menu.newMenuItem();
            }
        } else {
            System.out.println("Would you like to update an existing menu item? If so, enter 'update'.");
            input.nextLine();
            if (input.nextLine().toLowerCase().equals("update")) {
                restaurant.menu.updateMenuItem();
            }
        }
        System.out.println("Would you like to print out your entire menu? If so, enter 'print'.");
        if (input.nextLine().toLowerCase().equals("print")) {
            restaurant.menu.printMenu();
        } else {
            main(new String[] {"return to main menu"});
        }
    }

    private void restaurantConstruction() {
        Scanner input = new Scanner(System.in);
        System.out.println("First, what is the name of your restaurant?");
        String nameOfRestaurant = input.nextLine();
        System.out.println("What are the restaurant's hours of operation?");
        String restaurantHours = input.nextLine();
        this.name = nameOfRestaurant;
        this.hours = restaurantHours;
        System.out.println("If you'd like to provide detailed info about your restaurant, please enter 'info'.");
        if (input.nextLine().toLowerCase().equals("info")) {
            this.finishConstruction();
        }
    }

    private void finishConstruction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Where is your restaurant located?");
        this.location = input.nextLine();
        System.out.println("Who is the restaurant owner?");
        this.owner = input.nextLine();
        System.out.println("How many years have you been in business?");
        this.yearsInBusiness = input.nextInt();
    }

    private void createMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Who is the chef?");
        String nameOfChef = input.nextLine();
        System.out.println("Please provide a description of the restaurant.");
        String restaurantDescription = input.nextLine();
        System.out.println("How many items will be on the menu?");
        Integer numItems = input.nextInt();
        input.nextLine();
        Calendar lastUpdated = Calendar.getInstance();
        this.menu = new Menu(this.name, lastUpdated, numItems, nameOfChef, restaurantDescription, this.hours);
    }
}
