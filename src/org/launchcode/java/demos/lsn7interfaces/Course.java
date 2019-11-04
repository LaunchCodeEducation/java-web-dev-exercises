package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Course {
    private static int nextCourseId = 100000;
    private int id;
    private String name;
    private int credits;
    private ArrayList<Teacher> instructors;

    public Course(){
        id = nextCourseId;
        nextCourseId++;
    }
}
