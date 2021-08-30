// 4.8 Studio: Restaurant Menu
// 1. The menu consists of several menu items
// 2. The menu item has a price, description, and category (appetizer, main
//    course, or dessert)
// 3. It should be possible to display whether a menu item is new or not
// 4. The app should know when the menu was last updated, so visitors can
//    see that the restaurant is constantly changing and adding exciting
//    new items

package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuItem {
    private double price;
    private String description;
    // 8/18/2021 Potentially I might want to split categories out into its own
    // class but Studio 4.8 only wants Menu and MenuItems classes at the moment
    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("appetizer", "main course", "dessert")
    );
    private String category;
    private boolean isNewItem = true;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        if (categories.contains(category)) {
            this.category = category;
        } else {
            System.out.println("Invalid category. Please reset ASAP.");
        }
    }

    public void setPrice(double aPrice) {
        if (aPrice > 0) {
            price = aPrice;
        } else {
            System.out.println("Price must be a positive number.");
        }
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        if (categories.contains(category)) {
            this.category = category;
        } else {
            System.out.println("Invalid category, category cannot be set.");
        }
    }

    public void setIsNewItem(boolean aIsNewItem) {
        isNewItem = aIsNewItem;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNewItem() {
        return isNewItem;
    }

    public void printMenuItem() {
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("category: " + category);
        if (isNewItem) {
            System.out.println("new item!");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        MenuItem menuItem = (MenuItem) o;

        return description.equals(menuItem.description) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 31 * hash + (null == description ? 0 : description.hashCode());
        hash = 31 * hash + (null == category ? 0: category.hashCode());
        return hash;
    }
}
