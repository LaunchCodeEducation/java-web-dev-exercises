package exercises.class3;

import java.util.*;

public class ControlFlowAndCollections {
    public static void main(String[] args) {

        // 3.7.1. Array Practice

        int [] intArr = {1, 1, 2, 3, 5, 8};

        for (int n : intArr) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 1) {
                System.out.println(intArr[i]);
            }
        }

        String s1 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] s2 = s1.split(" ");
        System.out.println(s2);
        for (String s: s2) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(s2));

        String[] s4 = s1.split("//.");
        System.out.println(s4);
        for(String sentence : s4) {
            System.out.println(sentence);
        }
        System.out.println(Arrays.toString(s4));

//      3.7.2. ArrayList Practice
        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(1, 2));
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        arrlist.add(7);
        arrlist.add(8);
        arrlist.add(9);
        arrlist.add(10);

        System.out.println(calculateEvenSum((arrlist)));
//        System.out.println(printFiveLetterWord(s1.split(" ")));
        studentLogHashMap();
    }

    public static int calculateEvenSum( ArrayList<Integer> arr) {
        int sum = 0;

        for (int num : arr) {
            if ( num % 2 == 1) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printFiveLetterWord( List<String> strList) {
        for (String word: strList) {
            if (word.length() == 5 ) {
                System.out.println(word);
            }
        }
    }

    // 3.7.3 HashMap
    public static void studentLogHashMap() {
        HashMap<Integer, String> studentLog = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer studentID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID numbers
        do {

            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals((""))) {
                System.out.println("ID: ");
                studentID = input.nextInt();
                studentLog.put(studentID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student: studentLog.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in the roster: " + studentLog.size());

    }
}
