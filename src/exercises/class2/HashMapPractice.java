package exercises.class2;
import java.util.*;

public class HashMapPractice{
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();

        Scanner input = new Scanner(System.in);
        String studentName;
        int studentID;


        do{
            System.out.println("Enter an ID(enter zero to stop entering students): ");
            studentID = input.nextInt();

            if(studentID == 0){
                break;
            }

            System.out.println("Enter Student Name: ");
            studentName = input.next();

            students.put(studentID, studentName);
        } while(studentID > 0);

        System.out.print("Class Roster: ");

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
