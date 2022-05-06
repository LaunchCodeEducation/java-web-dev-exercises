package studio7;

public abstract class BaseDisc {
    private String name;
    private double storageCapacity = 10.0;
    private String content;
    private String diskType;

    public BaseDisc(String name, double storageCapacity, String content, String diskType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.content = content;
        this.diskType = diskType;
    }

    public String writeData(double dataEntered) {
        storageCapacity -= dataEntered;
        return "You've used " + dataEntered + " kB.";
    }
    public String readData() {
        return "You have " +  storageCapacity + " kB left on this disc.";
    }

    public String reportInfo() {
        return "This disc is a " + diskType + " called " + name + " .";
    }

    public String getName() {
        return name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public String getContent() {
        return content;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
