package exercises.technology;

public class Computer {
    private String processorType;
    private int ageInYears;
    private String ownerName;
    private Boolean isOn = false;

    public Computer(String processorType, int ageInYears, String ownerName) {
        this.processorType = processorType;
        this.ageInYears = ageInYears;
        this.ownerName = ownerName;
    }

    public Computer() {

    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Boolean getOn() {
        return isOn;
    }

    public String turnOn() {
        isOn = true;
        return "Computer is now running.";
    }

    public String turnOff() {
        isOn = false;
        return "Computer is now shut down.";
    }
}
