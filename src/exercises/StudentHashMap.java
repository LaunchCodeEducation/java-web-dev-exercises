import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newId;

        System.out.println("Enter student's Id (or ENTER to finish):");
        do {

            System.out.print("Id: ");
            newId = input.nextInt();
            if (newId != 0) {
                System.out.print("Name: ");
                String studentName = input.next();
                students.put(newId, studentName);
                input.nextLine();

            }
        }while (newId != 0) ;
            System.out.println("\nClass roster:");
            for (Map.Entry<Integer, String> student: students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");

            }

        }
    }


