package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.school.Teacher;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Iurii", 1, 1, 4.0);

        System.out.println(newStudent.getName());

        Teacher newTeacher = new Teacher("Chis", "Bay", "Software Development");

        System.out.println(newTeacher.getFirstName());
    }
}
