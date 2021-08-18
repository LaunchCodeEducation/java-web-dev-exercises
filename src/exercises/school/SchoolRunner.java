// 4.7 Exercises: Classes and Objects

package exercises.school;

import java.util.ArrayList;
import java.util.List;

public class SchoolRunner {
    public static void main(String[] args) {
        ArrayList<Student> studentsArrList = testStudent();
        System.out.println();
        Teacher profGrimson = testTeacher();
        testCourse(profGrimson, studentsArrList);
    }

    private static ArrayList<Student> testStudent() {
        Student adrian = new Student("Adrian", 1);
        Student beatrice = new Student("Beatrice", 2);
        Student charlene = new Student("Charlene", 3);
        Student duncan = new Student("Duncan", 4);

        ArrayList<Student> students = new ArrayList<>(
                List.of(adrian, beatrice, charlene, duncan)
        );

        return students;
    }

    protected static void testCourse(Teacher aTeacher, ArrayList<Student> studentsArrayList) {
        Course newCourse =
                new Course("Intro to CS Using Python", "6.001.x", 5, aTeacher);

        for (Student student : studentsArrayList) {
            newCourse.addStudentToCourse(student);
        }

        System.out.println("Course: " + newCourse.getSubject());
        System.out.println("Instructor: Prof. " + newCourse.getInstructor().getFirstName() + " "
                + newCourse.getInstructor().getLastName());
        System.out.print("Enrollment: ");
        newCourse.printEnrollment();
    }

    protected static Teacher testTeacher() {
        return new Teacher("Eric", "Grimson", "CS", 37);
    }
}
