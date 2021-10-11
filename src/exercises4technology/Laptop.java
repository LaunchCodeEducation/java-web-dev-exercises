package exercises4technology;

public class Laptop extends Computer{
    private boolean eGpuInstalled;

    public Laptop(int storage, int memory, int processorSpeed, boolean eGpuInstalled) {
        super(storage, memory, processorSpeed);
        this.eGpuInstalled = eGpuInstalled;
    }

    public boolean isPowerful() {
        if (eGpuInstalled && getProcessorSpeed() > 4000 && getMemory() > 32) {
            return true;
        }
        return false;
    }
}
