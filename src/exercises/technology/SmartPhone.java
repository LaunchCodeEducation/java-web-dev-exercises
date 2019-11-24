package exercises.technology;

import java.util.ArrayList;

public class SmartPhone extends Computer{
    private ArrayList<String> appsList;
    private ArrayList<String> callLog;
    private ArrayList<String> contacts;


    public String callContact(String contact) {
        if (contacts.contains(contact)) {
           return "Calling " + contact + "...";
        } else {
            return "Contact " + contact + " is not in your list. To add it, use the addContact method.";
        }
    }

    public String addContact(String contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            return "Contact added!";
        } else {
            return "Contact is already in your phone. To call, use the callContact method.";
        }
    }
}
