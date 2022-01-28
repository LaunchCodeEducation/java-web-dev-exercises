package org.launchcode.java.practice.chapterFour;

public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student() {this("Molly", 0);}

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getInfo() {
        return this.name + " has " + this.gpa + "GPA score and the ID number is " + this.studentId + ". Number of credits: " + this.numberOfCredits + ".";
    }

    public static void main(String[] args) {
        Student student = new Student("John", 126);
        System.out.println(new Student().getName());
        System.out.println(student.getName());
        System.out.println(student.getInfo());

        student.setName("Christi");
        System.out.println(student.getName());
    }
}
