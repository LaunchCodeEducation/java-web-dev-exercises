package studios.resturaunt;

import java.lang.management.MemoryUsage;

public class Main {

    public static void main(String[] args){
        Menu menu = new Menu();
        MenuItem pizza = new MenuItem("Bizza", 10.99, "its just pizza", "dinner", true);
        menu.addMenuItem(pizza);
        menu.viewMenuItem(pizza);
        System.out.println(menu.getUpdatedDate());
    }
}
