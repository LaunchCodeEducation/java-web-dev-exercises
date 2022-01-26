package org.launchcode.java.exercises.chapter2;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        System.out.print("Type your search word and I will check if it is within the sting I have: ");
        String request = input.nextLine();

        int index = sentence.toLowerCase().indexOf(request.toLowerCase());
        System.out.println("Index of your request is: " + index + ". The length of the request: " + request.length() + ".");

        String updatedSentence = sentence.substring(0, index) + sentence.substring(index + request.length());
        System.out.println(updatedSentence);

        input.close();
    }
}
