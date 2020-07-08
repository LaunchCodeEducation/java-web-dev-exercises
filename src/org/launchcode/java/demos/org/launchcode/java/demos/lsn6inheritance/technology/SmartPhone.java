package org.launchcode.java.demos.lsn6inheritance.technology;
//Didn't get to finish the method or write tests for it.
public class SmartPhone extends Computer {


    public SmartPhone(String aBrand, String aName, int aRamGB) {
        super(aBrand,
                aName,
                aRamGB);
    }
    private String operatingSystem;
//    private int aRamGB = 4;
    //1b. 1 additional property & method
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    private void printDeviceInfo() {
        System.out.println(getBrand() + " " +
                getName() + " " +
                getRamGB() + "GB");
    }

//    private canSyncWithComputer(String aOperatingSystem) {
//        if (aOperatingSystem.equalsIgnoreCase("IOS")) {
//            System.out.println(this.getName() + " can sync with a computer.");
//        } else System.out.println(this.getName() + " can not sync with a computer.");
//
//    }
}
