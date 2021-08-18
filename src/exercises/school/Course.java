package exercises.school;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
    private String subject;
    private String courseNumber;
    private int courseCredit;
    private String instructor;
    private ArrayList<Student> enrollment = new ArrayList<>();

    public Course(String subject, String courseNumber, int courseCredit, String instructor) {
        this.subject = subject;
        this.courseNumber = courseNumber;
        this.courseCredit = courseCredit;
        this.instructor = instructor;
    }

    public void setSubject(String aSubject) {
        subject = aSubject;
    }

    public void setCourseNumber(String aCourseNumber) {
        courseNumber = aCourseNumber;
    }

    public void setCourseCredit(int aCourseCredit) {
        courseCredit = aCourseCredit;
    }

    public void setInstructor(String aInstructor) {
        instructor = aInstructor;
    }

    public void addStudentToCourse(Student aStudent) {
        enrollment.add(aStudent);
    }

    public String getSubject() {
        return subject;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

//    private ArrayList<Student> getEnrollment() {
//        return enrollment;
//    }

    public void printEnrollment() {
        Iterator<Student> students = enrollment.iterator();

        while (students.hasNext()) {
            System.out.print(students.next().getName());
            if (students.hasNext()) {
                System.out.print(", ");
            }
        }

    }
}
