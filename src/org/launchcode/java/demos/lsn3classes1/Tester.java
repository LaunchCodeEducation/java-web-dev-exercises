package org.launchcode.java.demos.lsn3classes1;

public class Tester {
        public static void main (String[] args) {
            Student anthony = new Student();
            anthony.setName("Anthony");
            anthony.setNumberOfCredits(1);
            anthony.setGpa(4.0);

            System.out.println("Student " + anthony.getName() + " " + "gained " + anthony.getNumberOfCredits() + " credit(s)\nand has a GPA of : " + anthony.getGpa());
        }
}
