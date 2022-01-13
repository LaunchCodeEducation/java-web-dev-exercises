package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa){
        this.name = aName;
        this.studentId = aStudentId;
        this.numberOfCredits = aNumberOfCredits;
        this.gpa = aGpa;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public int getStudentID(){
        return this.studentId;
    }

    public void setStudentId(int aStudentId){
        this.studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double aGpa){
        this.gpa = aGpa;
    }
}