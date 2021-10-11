package exercises4technology;

public class Computer {
    private int storage;
    private int memory;
    private int processorSpeed;

    public Computer (int storage, int memory, int processorSpeed) {
        this.storage = storage;
        this.memory = memory;
        this.processorSpeed = processorSpeed;
    }

    public void upgradeStorage (int newStorage) {
        this.storage = newStorage;
    }

    public void upgradeMemory (int newMemory) {
        this.memory = newMemory;
    }

    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public int getMemory() {
        return memory;
    }
}
