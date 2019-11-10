package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What is the student's ID number? Enter 'finished' to finish student list.");
            if (input.next().toLowerCase().equals("finished")) {
                break;
            } else {
                Integer id = input.nextInt();
                System.out.println("What is the student's name?");
                String name = input.next();
                students.put(id, name);
            }
        }
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("id: " + student.getKey() + " name: " + student.getValue());
        }
    }
}
