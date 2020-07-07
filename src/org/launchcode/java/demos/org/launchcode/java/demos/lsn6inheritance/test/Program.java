package org.launchcode.java.demos.lsn6inheritance.test;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technology.Computer;

import static org.junit.Assert.*;

//2nd test fails, 3rd test not written
public class Program {
    Computer comp1 = new Computer("Lenovo", "MC100", 16);
    Computer comp2 = new Computer("HP", "XP-100", 4);

    @Test
    public void isLoudCorrectlyReturnsFalse(){
       assertFalse(comp1.isLoud())
;    }

    @Test
    public void isLoudCorrectlyReturnsTrue() {
        assertEquals(true, comp2.isLoud())
                ;
    }

}
