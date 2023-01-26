package org.launchcode.java.studios.chapter7.Quiz;

import java.util.Scanner;

public class QuizRunner {
public static void main (String[] args){
    Integer counter = 0;
    Integer numOfQuestions = 3;
    // Scanner placeholders
    Scanner answer1input = new Scanner(System.in);
    Scanner answer2input = new Scanner(System.in);
    Scanner answer3input = new Scanner(System.in);

    // Create test
    Question quiz = new Question("How many letters are in the English Alphabet: ",
            "Name all the vowels in the English alphabet without spaces in order: ",
            "True / False -- Is LaunchCode Awesome?: ");

    // Question 1
    System.out.println(quiz.getQuestion1());
    String answer1 = answer1input.nextLine();
    if (answer1.equals("26")) counter++;

    // Question 2
    System.out.println(quiz.getQuestion2());
    String answer2 = answer2input.nextLine().toLowerCase();
    if (answer2.equals("aeiou") || answer2.equals("aeiouy")) counter++;

    // Question 3
    System.out.println(quiz.getQuestion3());
    String answer3 = answer3input.nextLine().toLowerCase();
    if (answer3.equals("true")) counter++;

    // Results
    System.out.println("You scored a " + counter + " out of " + numOfQuestions);
}
}
