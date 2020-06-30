package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menus;

    public Menu(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public Menu() {
        this.menus = new ArrayList<MenuItem>();
    }

    public ArrayList<MenuItem> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        this.menus.add(aMenuItem);
    }
}