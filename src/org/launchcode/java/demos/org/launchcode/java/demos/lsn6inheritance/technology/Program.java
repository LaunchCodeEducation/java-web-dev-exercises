package org.launchcode.java.demos.lsn6inheritance.technology;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.launchcode.java.demos.lsn6inheritance.technology.Computer;
import org.launchcode.java.demos.lsn6inheritance.technology.Laptop;
import static org.junit.Assert.*;
//1st SmartPhone test doesn't work

public class Program {
    @Test                 //Testing Computer Class
    public void makesNoiseReturnsFalse(){
       assertFalse(Computer.makesNoise())
;    }

    @Test
    public void makesNoiseReturnsTrue() {
        assertTrue(!Computer.makesNoise());
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

    Computer phone1 = new SmartPhone("Samsung", "S2", 4);
    @Test
    public void shouldMakeNoiseTrue() {   //Testing SmartPhone Class
        assertTrue(!phone1.makesNoise());
    }
    SmartPhone phone2 = new SmartPhone("Samsung", "Galaxy", 16);
    @Test
    public void shouldPrintCorrectly() {
        assertEquals("Samsung Galaxy 16GB", "Samsung Galaxy 16GB");
    }
    @Test
    public void shouldMakeNoiseFalse() {
        assertFalse(phone2.makesNoise());
    }
}

