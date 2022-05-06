package studio7;

public class Main {

public static void main (String[] args){

    // TODO: Declare and initialize a CD and a DVD object.
DVD Titanic = new DVD("Titanic", 1000000000, "Movie", "DVD");
    // TODO: Call each CD and DVD method to verify that they work as expected.
System.out.println(Titanic.spinDisk());
    System.out.println(Titanic.readData());
    }
}
