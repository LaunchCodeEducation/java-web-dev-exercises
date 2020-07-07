package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer {
    private String brand;   //1a. parent class w/ 3 properties
    private String name;
    private Integer ramGB;
    private boolean isLoud;

    public Computer (String aBrand, String aName, Integer aRamGB){
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

    public Integer getRamGB() {
        return ramGB;
    }

    public void setRamGB(Integer ramGB) {
        this.ramGB = ramGB;
    }


    public boolean isLoud() {
        return isLoud;
    }

    public void setLoud(boolean loud) {
        isLoud = loud;
    }
    private void makesNoise() {
        if (this.ramGB >= 8) {
            isLoud = false;
        } else {
            isLoud = true;
        }
    }

}
