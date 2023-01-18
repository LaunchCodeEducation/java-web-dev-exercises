package exercises.chap3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashExer {
    public static void main (String[] args) {
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner (System.in);
        String newStudent;

        System.out.println("Enter a student (or ENTER to finish)");

        // Get student names and grades
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newId = input.nextDouble();
                students.put(newStudent, newId);

                // Read in the newLine before Looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ") ");
            sum += student.getValue();
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
