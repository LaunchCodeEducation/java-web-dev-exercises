package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer {
    private static int ramGB = 4;
    private String brand;   //1a. parent class w/ 3 properties
    private String name;
    private static boolean isLoud;

    public Computer (String aBrand, String aName, int aRamGB){
        brand = aBrand; //1a. parent class w/ 1 constructor
        name = aName;
        ramGB = aRamGB;
    }

    public String getBrand() { //1a. parent class w/ 2 methods
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        Computer.ramGB = ramGB;
    }


    public boolean isLoud() {
        return isLoud;
    }

    public void setLoud(boolean loud) {
        isLoud = loud;
    }
    public static boolean makesNoise() {
        if (ramGB < 8) {
            return isLoud = true;
        }
        else return isLoud = false;
    }

}
