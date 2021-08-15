package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class L03_4_1_ArrayList_ML {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        // https://stackoverflow.com/questions/36094804/while-loop-with-hasnext-condition-running-infinitely/36094824

        System.out.println("Enter your students, press enter after each name (or \"q\" to finish):");
        input.useDelimiter("\n");

        // Get student names
        while (!input.hasNext("q")){
            newStudent = input.next();
            newStudent = newStudent.trim();
            if (newStudent.length() > 0) {
                students.add(newStudent);
            }
        }

        // This line is next necessary so that Scanner moves past the 'q' and doesn't throw an java.util
        // .InputMismatchException
        input.next();

        // Get student grades

        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
