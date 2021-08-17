package exercises;

public class L04_2_1_HelloWorld_ML {
    String message = "Hello World";     // removed public from
                                        // L04_1_1_HelloWorld_ML declaration

    void sayHello() {
        System.out.println(message);    // also removed public from declaration
    }

    // 4.2.1 Access Modifiers
    // In this HelloWorld class, we omit the public access modifier in
    // lines 3 and 5. Doing this implicitly gives the message field and
    // the sayHello method default access.

    // We should avoid giving everything default access when creating classes
    // in Java and instead think carefully about what level of access each
    // field and method should have.

    private String newMessage = "Good night, World";

    public void sayNight() {
        System.out.println(newMessage);
    }

}
