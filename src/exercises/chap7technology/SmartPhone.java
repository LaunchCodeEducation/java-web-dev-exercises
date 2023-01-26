package exercises.chap7technology;

public class SmartPhone extends Computer{
    private String brand;
    public SmartPhone(String deviceName, Double price, Integer numberOfDevices, String brand) {
        super(deviceName, price, numberOfDevices);
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }
}
