package restaurant;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Menu myMenu = new Menu();
//        printElements(myMenu);

        System.out.println(new Menu().getMenus());

        MenuItem superBurger = new MenuItem("Cheese Burger", 17.99, "the best burger of your life", "main course");

        myMenu.addMenuItem(superBurger);
//        printElements(myMenu);

        superBurger.setPrice(18.99);

        MenuItem chocolateCheeseCake = new MenuItem("Chocolate Cheese Cake", 18.99, "A great dessert", "dessert");

        myMenu.addMenuItem(chocolateCheeseCake);
//        printElements(myMenu);

//        public static void printElements (Menu aMenu){
//            for (MenuItem d : aMenu.getMenus()){ System.out.println(d);
//
//        }

    }


}
