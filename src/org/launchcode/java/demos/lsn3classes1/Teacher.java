package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String aName) {
        firstName = aName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String aName) {
        lastName = aName;
    }

    public String getSubject() {
        return subject;
    }

    protected void setSubject(String aSubject) {
        subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    protected void setYearsTeaching(int aYear) {
        yearsTeaching = aYear;
    }


}
