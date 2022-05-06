package studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, double storageCapacity, String content, String diskType) {
        super(name, storageCapacity, content, diskType);
        // TODO: Implement your custom interface.

        // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
        //  need to be declared separately.

    }

    @Override
    public String spinDisk() {
        return "Disc is spinning!";
    }

    @Override
    public String storeData() {
        return "Data is stored";
    }
}
