package org.launchcode.java.demos.lsn3classes1;

import org.w3c.dom.ls.LSOutput;

public class SchoolPractice {
    public static void main(String[] args) {
        // 2. Instantiate your Student class for part 2 here!
        Student kishaHymes = new Student("Kisha Hymes", 0, 1, 4.0);
//        kishaHymes.setName("Kisha Hymes");
//        kishaHymes.setNumberOfCredits(1);
//        kishaHymes.setGpa(4.0);

        kishaHymes.addGrade(3,3.0); //testing methods to see if they work correctly.
        System.out.println(kishaHymes.studentInfo());
        System.out.println(kishaHymes.getGradeLevel());
    }

}
