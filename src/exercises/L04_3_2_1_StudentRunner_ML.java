package exercises;

public class L04_3_2_1_StudentRunner_ML {
    public static void main(String[] args) {
        L04_3_2_1_Student_ML aStudent = new L04_3_2_1_Student_ML();

        System.out.println("student name: " + aStudent.getName());
        aStudent.setName("Julia Child");
        System.out.println("student name: " + aStudent.getName() + "\n");

        System.out.println("student ID: " + aStudent.getStudentId());
        aStudent.setStudentId(7);
        System.out.println("student ID: " + aStudent.getStudentId() + "\n");

        // initialized in class
        aStudent.setNumberOfCredits(24);
        System.out.println("number of credits: " + aStudent.getNumberOfCredits() + "\n");

        // initialized in class
        aStudent.setGpa(3.72);
        System.out.println("student GPA: " + aStudent.getGpa());
    }
}
