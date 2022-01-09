package org.launchcode.java.studios.countingcharacters;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
    public static String readFile(String filePath){

        String theString = "";

        try {
            File readFile = new File(filePath);
            Scanner scanFile = new Scanner(readFile);

            while (scanFile.hasNextLine()) {
                theString += scanFile.nextLine();
            }

            scanFile.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");

            e.printStackTrace();
        }

        return theString;
    }
}
