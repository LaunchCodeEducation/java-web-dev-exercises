package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name = "Lindsey";
    private int studentId;
    private int numberOfCredits = 1;
    private double gpa = 4.0;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentID) {
        this.studentId = aStudentID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberCredits) {
        this.numberOfCredits = aNumberCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

}