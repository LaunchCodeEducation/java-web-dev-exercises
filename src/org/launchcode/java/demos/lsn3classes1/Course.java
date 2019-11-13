package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private HashMap<String, Integer> students;
    private String courseName;
    private double crn;
    private String courseTime;
    private String courseDate;
    private String teacher;

    public Course(String courseName, double crn, String courseTime, String courseDate, String teacher) {
        this.courseName = courseName;
        this.crn = crn;
        this.courseTime = courseTime;
        this.courseDate = courseDate;
        this.teacher = teacher;
    }

    public HashMap AddStudent(String studentName, Integer studentId) {
        Student student = new Student();
        student.setName(studentName);
        student.setStudentId(studentId);
        this.students.put(studentName, studentId);
        return students;
    }

}
