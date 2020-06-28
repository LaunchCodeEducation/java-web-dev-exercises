package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //5.1 Add constructor
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0,0);
    }
    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        //5.2 update the fields for numberofCredits, gpa
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        this.gpa = ((this.gpa + (grade * courseCredits))/this.numberOfCredits);
        setNumberOfCredits(this.numberOfCredits);
        setGpa(this.gpa);

    }

    public String getGradeLevel() {
        //5.1 determine the grade level based on numberofCredits
        if (this.numberOfCredits < 30) {
            return (this.name + " has " + numberOfCredits + " credits and is a Freshman.");
        }
        else if (this.numberOfCredits < 60) {
            return (this.name + " has " + numberOfCredits + " credits and is a Sophomore.");
        }
        else if (this.numberOfCredits < 90) {
            return (this.name + " has " + numberOfCredits + " credits and is a Junior.");
        }
        else {
            return (this.name + " has " + numberOfCredits + " credits and is a Senior.");
        }
    }

    //4.1. Add necessary getters and setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}