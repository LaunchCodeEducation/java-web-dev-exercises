package exercises.org.launchcode.java;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String  newStudent;

        System.out.println("enter student ID (or Enter when finish): ");

        do {
            System.out.print("Student Name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals(""));{
                System.out.println("Student ID: ");
               Integer idNumber= input.nextInt();
                students.put(idNumber, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));
        System.out.println("\nClass roster:");
        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("name: " +student.getValue() + ": + ID = " + student.getKey());

        };
    }
}