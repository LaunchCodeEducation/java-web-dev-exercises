package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
//        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Before: ");
        for (Flavor nextFlavor: flavors) {
            System.out.println(nextFlavor.getName());
        }
        System.out.println(" ");
        System.out.println("After:");
        flavors.sort(new FlavorComparator());
        for (Flavor nextFlavor: flavors) {
            System.out.println(nextFlavor.getName());
        }
        System.out.println("*************** Cones cost ******************");
        System.out.println("Before: ");
        for (Cone nextCone: cones) {
            System.out.print(nextCone.getName());
            System.out.println(": " + nextCone.getCost());
        }
        System.out.println(" ");
        System.out.println("After:");
        cones.sort(new ConeComparator());
        for (Cone nextCone: cones) {
            System.out.print(nextCone.getName());
            System.out.println(": " + nextCone.getCost());
        }
    }
}
