package org.launchcode.java.demos.lsn6inheritance.test;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.launchcode.java.demos.lsn6inheritance.technology.Computer;
import org.launchcode.java.demos.lsn6inheritance.technology.Laptop;
import static org.junit.Assert.*;


public class Program {
    @Test                 //Testing Computer Class
    public void makesNoiseReturnsFalse(){
       assertFalse(!Computer.makesNoise())
;    }

    @Test
    public void makesNoiseReturnsTrue() {
        assertTrue(Computer.makesNoise());
    }
    @Test
    public void hasClassNotReturnsNull() {
        assertNotNull(Computer.class);
    }
    @Test                   //Testing Laptop Class (method)
    public void hasAppropriateProcessorReturnsTrue() {
        assertTrue(Laptop.hasAppropriateProcessor("i7"));
    }
    @Test
    public void hasAppropriateProcessorReturnsFalse() {
        assertFalse(Laptop.hasAppropriateProcessor("foo"));
    }


}

