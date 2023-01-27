package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
//        Integer test = o1.getName().compareTo(o2.getName());
//        System.out.println("test number" + test);
        return o1.getName().compareTo(o2.getName());
    }
}
