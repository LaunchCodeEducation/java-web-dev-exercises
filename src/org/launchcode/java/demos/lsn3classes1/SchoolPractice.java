package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student newStudent = new Student("Melissa", 1990, 1, 4.0);

        System.out.println(newStudent.getName());
        System.out.println(newStudent.getStudentID());
        System.out.println(newStudent.getGpa());
        System.out.println(newStudent.getNumberOfCredits());

        Student ismaelStudent = new Student("Ismael", 2010, 5000, 4.8);

        System.out.println(ismaelStudent.getName());
        System.out.println(ismaelStudent.getStudentID());
        System.out.println(ismaelStudent.getGpa());
        System.out.println(ismaelStudent.getNumberOfCredits());
    }
}
