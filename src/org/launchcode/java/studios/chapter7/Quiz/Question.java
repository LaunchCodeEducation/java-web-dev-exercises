package org.launchcode.java.studios.chapter7.Quiz;

public class Question {
    String question1;
    String question2;
    String question3;
    public Question(String singleAnswer, String multipleChoice, String trueOrFalse) {
        this.question1 = singleAnswer;
        this.question2 = multipleChoice;
        this.question3 = trueOrFalse;
    }
    public String getQuestion1() {
        return this.question1;
    }
    public String getQuestion2() {
        return this.question2;
    }
    public String getQuestion3() {
        return this.question3;
    }
}
