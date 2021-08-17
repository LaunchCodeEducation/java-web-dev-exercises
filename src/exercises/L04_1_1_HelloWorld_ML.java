package exercises;

public class L04_1_1_HelloWorld_ML {
    public String message = "Hello World";

    public void sayHello() {
        String message = "Goodbye World";
        System.out.println(message);        // prints "Goodbye World"
        System.out.println(this.message);   // prints "Hello World"

        // 4.1.2 The this Keyword
        // When a local variable has the same name as a field, we say that the
        // local variable shadows the field.
        // Errors caused by shadowing can be tricky to spot, so it's best to
        // avoid doing this in our code.
    }
}
