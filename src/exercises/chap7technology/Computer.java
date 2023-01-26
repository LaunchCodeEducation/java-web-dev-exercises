package exercises.chap7technology;

public class Computer {
    private  String deviceName;
    private Double price;
    private Integer numberOfDevices;
    public Computer (String deviceName, Double price, Integer numberOfDevices) {
        this.deviceName = deviceName;
        this.price = price;
        this.numberOfDevices = numberOfDevices;
    }

    public Double getPrice() {
        return this.price;
    }
    public String getDeviceName() {
        return this.deviceName;
    }
    public Integer getNumberOfDevices() {
        return this.numberOfDevices;
    }
}
