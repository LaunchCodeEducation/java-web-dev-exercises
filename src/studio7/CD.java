package studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, double storageCapacity, String content, String diskType) {
        super(name, storageCapacity, content, diskType);
    }
    @Override
    public String spinDisk() {
        return "Disc is spinning!";
    }

    @Override
    public String storeData() {
        return "Data is stored";
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
