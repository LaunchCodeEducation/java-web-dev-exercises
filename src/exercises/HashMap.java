package exercises;

import java.util.Map;
import java.util.Scanner;

public class HashMap {

    public static void main(String[] args) {

        java.util.HashMap<String, Integer> classRoster = new java.util.HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : classRoster.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
