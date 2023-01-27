package exercises.chap7technology;

// importing packages
import exercises.chap7technology.*;
// testing functionality
import org.junit.*;
import static org.junit.Assert.*;

public class Program {
    Computer windows;
    @Before
    public void createComputer() {windows = new Computer("Eurus", 1300.00, 1);}

    // Tests Computer Methods
    @Test
    public void testComputerGetPrice() {
        assertEquals(1300.00, windows.getPrice(), 0.001);
    }
    @Test
    public void testComputerGetName() {
        assertEquals("Eurus", windows.getDeviceName());
    }
    @Test
    public void testComputerGetNumberOfDevices() {
        assertEquals(1, windows.getNumberOfDevices(), 0.001);
    }

    // Tests Laptop Methods
    Laptop dell;
    @Before
    public void createLaptop() {dell = new Laptop("Dell", 1300.00, 1, "Ryzen");}

    @Test
    public void testLaptopName() {
        assertEquals("Dell", dell.getDeviceName());
    }
    @Test
    public void testLaptopBrandName() {
        assertEquals("Ryzen", dell.getBrand());
    }

    // Tests SmartPhone methods
    SmartPhone apple;
    @Before
    public void createSmartPhone() {apple = new SmartPhone("iPhone", 1300.00, 1, "Apple");}

    @Test
    public void testDeviceName() {
        assertEquals("iPhone", apple.getDeviceName());
    }
    @Test
    public void testBrandName() {
        assertEquals("Apple", apple.getBrand());
    }
}
