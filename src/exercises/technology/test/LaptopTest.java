package exercises.technology.test;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LaptopTest {
    Laptop testLaptop;

    @Before
    public void createLaptop() {
        testLaptop = new Laptop("Mac", 12.5);
    }

    @Test
    public void checkLaptopCharging() {
        int charge = testLaptop.getCurrentCharge();
        testLaptop.chargeLaptop();
        assertEquals(charge + 1, testLaptop.getCurrentCharge());
    }

    @Test
    public void addAppWorks() {
        testLaptop.downloadApp("IntelliJ");
        assertTrue(testLaptop.getApplicationList().contains("IntelliJ"));
    }

    @Test
    public void openAppWorks() {
        assertEquals("App Calculator is now open.", testLaptop.openApp("Calculator"));
    }

    @Test
    public void openAppThatIsNotThere() {
        assertEquals("App is not on the laptop. To download it, use the downloadApp method.", testLaptop.openApp("Fossil Finder"));
    }
}
