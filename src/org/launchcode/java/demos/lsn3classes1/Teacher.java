package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;

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

    public Integer getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(Integer yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    private String subject;
    private Integer yearsTeaching;
}
