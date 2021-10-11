package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private ArrayList studentNames;
    private HashMap studentIDs;

    public String getCourseName() {
        return courseName;
    }

    public ArrayList getStudentNames(){
        return studentNames;
    }

    public HashMap getStudentIDs() {
        return studentIDs;
    }

    public void setCourseName(String aCourseName) {
        this.courseName = aCourseName;
    }

    public void setStudentNames(ArrayList aStudentNames) {
        this.studentNames = aStudentNames;
    }

    public void setStudentIDs(HashMap aStudentIDs) {
        this.studentIDs = aStudentIDs;
    }
}
