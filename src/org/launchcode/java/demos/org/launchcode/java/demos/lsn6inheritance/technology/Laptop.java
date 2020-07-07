package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer {
//    private String processor; //1.b child class has 1 more property
    private static boolean AppropriateProcessor = false;
    public Laptop(String aBrand, String aName, int aRamGB) {
        super(aBrand, aName, aRamGB);
    }

//    public String getProcessor() {
//        return processor;
//    }
//
//    public void setProcessor(String processor) {
//        this.processor = processor;
//    }
//
    public boolean isAppropriateProcessor() {
        return AppropriateProcessor;
    }

    public void setAppropriateProcessor(boolean appropriateProcessor) {
        AppropriateProcessor = appropriateProcessor;
    }

    public static boolean hasAppropriateProcessor(String aProcessor) { //1b. child class has method
        if (aProcessor.equalsIgnoreCase("i3")) {
            return AppropriateProcessor = false;
        } else if (aProcessor.equalsIgnoreCase("i5")) {return AppropriateProcessor = true;
    }
        else  if (aProcessor.equalsIgnoreCase("i7")) { return AppropriateProcessor = true;
        } return AppropriateProcessor = false;

    }
}


