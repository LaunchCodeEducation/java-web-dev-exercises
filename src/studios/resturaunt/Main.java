package studios.resturaunt;

import java.lang.management.MemoryUsage;

public class Main {

    public static void main(String[] args){
        Menu menu = new Menu();
        MenuItem pizza = new MenuItem("Bizza", 10.99, "its just pizza", "dinner", true);
        menu.addMenuItem(pizza);
        MenuItem pizza2 = new MenuItem("Bizza", 10.99, "its just pizza", "dinner", true);
        System.out.println(pizza.equals(pizza2));
        MenuItem tacos = new MenuItem("tacos", 208.99, "just a lot of tacos", "dinner", true);
        menu.addMenuItem(tacos);
        System.out.println(menu.toString());
        menu.deleteMenuItem(pizza);

    }
}
