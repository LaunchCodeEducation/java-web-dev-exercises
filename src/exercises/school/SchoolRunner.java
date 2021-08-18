package exercises.school;

import java.util.ArrayList;
import java.util.List;

public class SchoolRunner {
    public static void main(String[] args) {
        testStudent();
        System.out.println();
        testCourse();
    }

    private static void testStudent() {
        Student newStudent = new Student("May", 1, 1, 4.0);
        System.out.println(newStudent.getName());
    }

    protected static void testCourse() {
        Course newCourse =
                new Course("Intro to CS Using Python", "6.001.x", 5, "Prof. Eric Grimson");

        Student adrian = new Student("Adrian", 1);
        Student beatrice = new Student("Beatrice", 2);
        Student charlene = new Student("Charlene", 3);
        Student duncan = new Student("Duncan", 4);

        ArrayList<Student> students = new ArrayList<>(
                List.of(adrian, beatrice, charlene, duncan)
        );

        for (Student student : students) {
            newCourse.addStudentToCourse(student);
        }

        System.out.println("Course: " + newCourse.getSubject());
        System.out.print("Enrollment: ");
        newCourse.printEnrollment();
    }
}
