package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private int GradeLevel;

    public Student (String name, int studentId, int numberOfCredits, double gpa,int GradeLevel){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.GradeLevel =  GradeLevel;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
    }

    public String getGradeLevel(String GradeLevel) {
        return GradeLevel;
        // Determine the grade level of the student based on numberOfCredits
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }


}

