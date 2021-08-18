package exercises;

public class L04_4_1_Student_ML {
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public L04_4_1_Student_ML(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

//    public L04_4_1_Student_ML(String name, int studentId) {
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = 0;
//        this.gpa = 0.0;
//    }

    // Better constructor than above
    public L04_4_1_Student_ML(String name, int studentId) {
        this(name, studentId, 0, 0.0);
    }
}
