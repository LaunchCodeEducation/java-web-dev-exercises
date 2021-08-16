package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class L03_7_3_HashMap_Practice {
    public static void main(String[] args) {
        HashMap<Integer, String> studentRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent = "";

        do {
            System.out.print("Enter student name: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("Enter student ID: ");
                Integer studentId = input.nextInt();
                studentRoster.put(studentId, newStudent);
            }
            input.nextLine();
        } while (!newStudent.equals(""));

        System.out.println("*** Student Roster ***");
        for (Map.Entry<Integer, String> student : studentRoster.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
