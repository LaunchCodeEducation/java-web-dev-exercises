package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

//3. Create Course w/ 3 fields, at least 1 ArrayList or HashMap
public class Course {
    private String name;
    private Integer credits;
    private HashMap <Integer, String> studentRoster;

//5.3.2 Add custom equals() and toString() methods
    public boolean equals(Object toBeCompared) {
    if (toBeCompared == this) {
        return true;
    }
    if (toBeCompared == null) {
        return false;
    }
    if (toBeCompared.getClass() != getClass()) {
        return false;
    }
    Course theCourse = (Course) toBeCompared;
    return theCourse.getName() == getName();
}

    public String toString() {
        return name + " (Credits: " + credits + ", Students enrolled: " + studentRoster.size() + ")";
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
