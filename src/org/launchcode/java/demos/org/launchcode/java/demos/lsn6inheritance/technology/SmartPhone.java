package org.launchcode.java.demos.lsn6inheritance.technology;

public class SmartPhone extends Computer{
    private String operatingSystem; //1b. 1 additional property & method
    public SmartPhone(String aBrand, String aName) {
        super(aBrand, aName);
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
