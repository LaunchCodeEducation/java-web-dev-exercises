package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
public class catTest {
    @Test
    // validate the subclass constructor has inheritied the base class constructor
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), 0.001) ;
    }
}
