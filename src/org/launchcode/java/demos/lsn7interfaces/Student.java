package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Student {
    private static int nextStudentId = 1;
    private int id;
    private String name;
    private ArrayList<Course> schedule;
    private double gpa;

    public Student(){
        id = nextStudentId;
        nextStudentId++;
    }

    public Student(String aName, ArrayList<Course> aSchedule, double aGpa){
        this();
        name = aName;
        schedule = aSchedule;
        gpa = aGpa;
    }

    private String printSchedule(ArrayList<Course> classList){
        String output = "";
        for (Course item : classList){
            output += item+"\n";
        }
        return output;
    }
}
