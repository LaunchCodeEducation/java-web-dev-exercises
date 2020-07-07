package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer {
    private String processor; //1.b child class has 1 more property
    private boolean AppropriateProcessor = false;
    public Laptop(String aBrand, String aName) {
        super(aBrand, aName);
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public boolean isAppropriateProcessor() {
        return AppropriateProcessor;
    }

    public void setAppropriateProcessor(boolean appropriateProcessor) {
        AppropriateProcessor = appropriateProcessor;
    }

    public void hasAppropriateProcessor(){ //1b. child class has method
        if (processor.equalsIgnoreCase("i3")) {
           AppropriateProcessor = false;
        }
        else if (processor.equalsIgnoreCase("i5")) AppropriateProcessor = true;
        else AppropriateProcessor = processor.equalsIgnoreCase("i7");
        }
}


