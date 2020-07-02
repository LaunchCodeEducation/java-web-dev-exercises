package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menus;
    private Date dateModified;

    public static Date getTime() {return new Date();}
    public Menu(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public Menu() {
        this.menus = new ArrayList<MenuItem>(); dateModified = new Date();
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

    public void removeMenuItem(MenuItem aMenuItem) {this.menus.remove(aMenuItem);}
}