package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        if(this.numberOfCredits >= 90){
            return "Senior";
        } else if(this.numberOfCredits >= 60){
            return "Junior";
        } else if(this.numberOfCredits >= 30){
            return "Sophomore";
        } else {
            return "Freshman";
        }
    }
   // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        this.gpa = (courseCredits * grade) + (this.gpa * this.numberOfCredits);
        this.numberOfCredits += courseCredits;

        this.gpa = this.gpa / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString(){
        return "Name: " + name + "(GPA: " + Math.round(gpa*100.0)/100.0 + ", Credits: " + numberOfCredits + ", Rank: " + this.getGradeLevel() + ")";
    }

    public boolean equals(Object toBeCompared){
        if(toBeCompared == null){
            return false;
        }

        if(toBeCompared.getClass() != getClass()){
            return false;
        }

        Student theStudent = (Student) toBeCompared;

        return theStudent.getStudentId() == getStudentId();
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,0,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");

       Student sallyTwo = new Student("SallyTwo", 1, 0, 4.0);

       System.out.println(sally.equals(sallyTwo));
       /* System.out.println(sally);
        sally.addGrade(3, 4.0);
        System.out.println(sally);
        sally.addGrade(4, 3.0);
        System.out.println(sally);
        */
    }
}
