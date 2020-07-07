package org.launchcode.java.demos.lsn6inheritance.technology;

public class SmartPhone extends Computer{
    private String operatingSystem; //1b. 1 additional property & method
    public SmartPhone(String aBrand, String aName, Integer aRamGB) {
        super(aBrand,
                aName,
                aRamGB);
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
