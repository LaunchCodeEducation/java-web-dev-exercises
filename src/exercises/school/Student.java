package school;

import java.util.Scanner;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public void getName()
        {
            System.out.println(this.name);
        }

        public void setName(String aName)
        {
            this.name = aName;
        }

        public void getStudentId()
        {
        System.out.println(this.studentId);
        }

        public void setStudentId(int astudentId)
        {
        this.studentId = astudentId;
        }

        public void setNumberOfCredits(int anumberOfCredits){
            this.numberOfCredits=anumberOfCredits;
        }

        public void getNumberOfCredits(){
            System.out.println(this.numberOfCredits);
        }

        public void setGpa(double agpa){
            this.gpa=agpa;
        }

        public void getGpa(){
            System.out.println(this.gpa);
    }

    }


