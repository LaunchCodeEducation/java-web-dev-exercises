package org.launchcode.java.demos.lsn6inheritance.technology;
//Didn't get to finish the method or write tests for it.
public class SmartPhone extends Computer {
    private String operatingSystem; //1b. 1 additional property & method

    public SmartPhone(String aBrand, String aName, int aRamGB) {
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

//    private canSyncWithComputer(String aOperatingSystem) {
//        if (aOperatingSystem.equalsIgnoreCase("IOS")) {
//            System.out.println(this.getName() + " can sync with a computer.");
//        } else System.out.println(this.getName() + " can not sync with a computer.");
//
//    }
}
