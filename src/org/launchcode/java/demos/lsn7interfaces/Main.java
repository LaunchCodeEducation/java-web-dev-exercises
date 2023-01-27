package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator coneComp = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        ArrayList<Flavor> organizedFlavors = menu.getFlavors();

        System.out.println("Flavor Organizer\n- - - - - - -");
        System.out.println("Before:");
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).getName());
        }
        System.out.println("\nAfter:");
        organizedFlavors.sort(comparator);
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).getName());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\nCones Organizer\n- - - - - - -");
        System.out.println("Before:");
        for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i).getName() + ": $" + cones.get(i).getCost());
        }
        cones.sort(coneComp);
        System.out.println("\nAfter:");
        for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i).getName() + ": $" + cones.get(i).getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        // Commit test
    }
}
