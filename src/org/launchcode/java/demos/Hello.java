package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    private static int next = 1;
    public static void main(String[] args) {
        System.out.println("Hello, World");
        Hello test = new Hello();
        System.out.println(next);
        Hello hello = new Hello();
        hello.setNext();
        System.out.println(next);
    }
    public void setNext() {
        next = 2;
        System.out.println(this.next);
    }
}

