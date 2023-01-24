package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructorTest;
    private ArrayList<Student> enrolledStudents;
    private int credits;
    private String instructor;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public Course (String title, int credits, String instructor) {
        this.topic = topic;
        this.credits = credits;
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return topic.equals(course.topic) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

}
