package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SetInput {
    public static String main(String filepath) {
        String text = "";
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                text += myReader.nextLine();
            }
            System.out.println("File found, using its contents as input string");
            myReader.close();
        } catch (FileNotFoundException e) {
            text = filepath;
            System.out.println("Input is not a valid filename, using filename as input string instead.");
        }
        return text;
    }
}
