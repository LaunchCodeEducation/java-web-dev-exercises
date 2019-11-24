package exercises.technology;

import java.util.ArrayList;

public class Laptop extends Computer {
    private String brandName;
    private double screenSize;
    private int currentCharge = 100;
    private ArrayList<String> applicationList = new ArrayList<>();

    public Laptop(String brandName, double screenSize) {
        this.brandName = brandName;
        this.screenSize = screenSize;
        applicationList.add("Finder");
        applicationList.add("Calculator");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getCurrentCharge() {
        return currentCharge;
    }

    public void setCurrentCharge(int currentCharge) {
        this.currentCharge = currentCharge;
    }

    public ArrayList<String> getApplicationList() {
        return applicationList;
    }

    public String chargeLaptop() {
        currentCharge ++;
        return "Laptop is now on the charger.";
    }

    public String openApp(String app) {
        if (applicationList.contains(app)) {
            return "App " + app + " is now open.";
        } else {
            return "App is not on the laptop. To download it, use the downloadApp method.";
        }
    }

    public String downloadApp(String app) {
        if (!applicationList.contains(app)) {
            applicationList.add(app);
            return "Application added!";
        } else {
            return "Application already on the computer. To run it, use the openApp method.";
        }
    }
}
