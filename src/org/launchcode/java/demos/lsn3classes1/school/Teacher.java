package org.launchcode.java.demos.lsn3classes1.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsOfTeaching = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfTeaching() {
        return yearsOfTeaching;
    }

    public void setYearsOfTeaching(int yearsOfTeaching) {
        this.yearsOfTeaching = yearsOfTeaching;
    }

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
}
