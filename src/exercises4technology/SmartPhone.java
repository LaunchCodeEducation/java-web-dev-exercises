package exercises4technology;

public class SmartPhone extends Computer {
    private String radioTechnology;

    public SmartPhone(int storage, int memory, int processorSpeed, String radioTechnology) {
        super(storage, memory, processorSpeed);
        this.radioTechnology = radioTechnology;
    }

    public boolean attCompatible() {
        if (this.radioTechnology.toLowerCase() == "gsm") {
            return true;
        } else {
            System.out.println("Not compatible with AT&T");
            return false;
        }
    }

}
