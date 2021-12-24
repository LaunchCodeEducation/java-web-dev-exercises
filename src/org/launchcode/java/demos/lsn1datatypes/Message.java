package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        }  else if (lang.equals("gm")) {
            return "Hallo Welt!";
        }else {
            return "Hello, World!";
        }
    }
}
