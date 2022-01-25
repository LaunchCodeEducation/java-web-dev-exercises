package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, World");
        // primitive data types
        int year = 2022;
        double pi = 3.14;
        boolean isTuesday = true;
        char myChar = 's';

        // object data types
        String name = "Iurii Rudov";
        Integer nextYear = 2023;
        Double longerPi = 3.14159;
        Boolean isWednesday = false;
        Character anotherChar = 'b';

        // .equals wants a thing of type Object
        nextYear.equals(year);

        // arrays in Java have FIXED LENGTH
        String[] names = {"John", "Annie", "Jack"};
        names[0] = "Christopher";
        int[] years = new int[10];

        // nextYear == 2000; // use this only for primitive data types on both sides
        nextYear.equals(2000); // always use this for objects

        String str = "Rutabaga wants to learn Java!";
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2, 4));
        System.out.println(str.length());
        System.out.println(str.indexOf("a"));

    }
}
