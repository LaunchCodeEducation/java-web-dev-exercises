package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private int credits;
    private ArrayList<Student> enrolledStudents;

    public Course(String title, int credits, Teacher instructor) {
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;

    }
    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @java.lang.Override
    public java.lang.String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", credits=" + credits +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Course course = (Course) object;
        return credits == course.credits && topic.equals(course.topic) && instructor.equals(course.instructor) && enrolledStudents.equals(course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), topic, instructor, credits, enrolledStudents);
    }
}
