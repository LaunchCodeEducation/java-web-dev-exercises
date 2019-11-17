package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student theStudent = new Student();
        theStudent.setName("Eli");
        theStudent.setStudentId(4);
        theStudent.setNumberOfCredits(9);
        theStudent.setGpa(4.0);
        System.out.println(theStudent.toString());

    }
}
