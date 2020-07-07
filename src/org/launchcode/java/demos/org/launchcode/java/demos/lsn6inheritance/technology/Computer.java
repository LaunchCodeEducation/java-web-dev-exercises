package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer {
    private String brand;   //1a. parent class w/ 3 properties
    private String name;
    private Integer ramGB;

    public Computer (String aBrand, String aName){
        brand = aBrand; //1a. parent class w/ 1 constructor
        name = aName;
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
}
