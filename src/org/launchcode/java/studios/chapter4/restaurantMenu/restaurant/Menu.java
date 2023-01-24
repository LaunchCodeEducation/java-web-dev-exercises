package org.launchcode.java.studios.chapter4.restaurantMenu.restaurant;

import java.util.*;


public class Menu {
    private ArrayList<MenuItem> entres = new ArrayList<>();
    private ArrayList<MenuItem> drinks = new ArrayList<>();
    private ArrayList<MenuItem> dressings = new ArrayList<>();

    public void entres() {
        // item 1
        MenuItem item1 = new MenuItem();
        item1.setItemName("Cheese Pizza");
        item1.setItemPrice(10.00);
        entres.add(item1);
        // item 2
        MenuItem item2 = new MenuItem();
        item2.setItemName("Bacon Topped Pizza");
        item2.setItemPrice(12.50);
        entres.add(item2);
    }
    public String getEntres() {
        String entresMenu = "";
        for (int i = 0; i < entres.size(); i++) {
            if (entres.get(i).equals(entres.get(entres.size() - 1))) {
                entresMenu += (i + 1) + ": " + entres.get(i).getItemName() + " $" + entres.get(i).getItemprice() + "\t*Newest Entre*\n";
            }
            else entresMenu += (i + 1) + ": " + entres.get(i).getItemName() + " $" + entres.get(i).getItemprice() + "\n";
        }
        return entresMenu;
    }

    public void drinks() {
        // item 1
        MenuItem sprite = new MenuItem();
        sprite.setItemName("Sprite");
        sprite.setItemPrice(1.00);
        drinks.add(sprite);
        // item 2
        MenuItem coke = new MenuItem();
        coke.setItemName("Coke");
        coke.setItemPrice(1.00);
        drinks.add(coke);
    }
    public String getDrinks() {
        String drinkMenu = "";
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).equals(drinks.get(drinks.size() - 1))) {
                drinkMenu += (i + 1) + ": " + drinks.get(i).getItemName() + " $" + drinks.get(i).getItemprice() + "\t*Newest Drink*\n";
            }
            else drinkMenu += (i + 1) + ": " + drinks.get(i).getItemName() + " $" + drinks.get(i).getItemprice() + "\n";
        }
        return drinkMenu;
    }

    public void dressing() {
        // item 1
        MenuItem ranch = new MenuItem();
        ranch.setItemName("Side of Ranch");
        ranch.setItemPrice(0.75);
        dressings.add(ranch);
        // item 2
        MenuItem blueCheese = new MenuItem();
        blueCheese.setItemName("Side of Blue Cheese");
        blueCheese.setItemPrice(0.75);
        dressings.add(blueCheese);
    }
    public String getDressings(){
        String dressingMenu = "";
        for (int i = 0; i < dressings.size(); i++) {
            if (dressings.get(i).equals(dressings.get(dressings.size() - 1))) {
                dressingMenu += (i + 1) + ": " + dressings.get(i).getItemName() + " $" + dressings.get(i).getItemprice() + "\t*Newest Dressing*\n";
            }
            else dressingMenu += (i + 1) + ": " + dressings.get(i).getItemName() + " $" + dressings.get(i).getItemprice() + "\n";
        }
        return dressingMenu;
    }
}
