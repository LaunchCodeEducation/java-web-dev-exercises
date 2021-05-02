package restaurant;

import java.util.ArrayList;

public class MenuItem {

    private String name;
    private double price;
    private String category;
    private String description;
    private String newItem;

    public MenuItem(String name, double price,
                    String category, String description, String newItem) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.newItem = newItem;
    }

    public static void main(String[] args) {
        ArrayList<String> MenuItem = new ArrayList<String>();

        MenuItem.add("chicken");
        MenuItem.add("steak");
        MenuItem.add("pizza");
        MenuItem.add("fish");
        System.out.println("Menu items: " + MenuItem);

        MenuItem.remove("chicken");
        MenuItem.add("steak");
        MenuItem.add("pizza");
        MenuItem.add("fish");
        System.out.println("Menu items: " + MenuItem);

    }
}

