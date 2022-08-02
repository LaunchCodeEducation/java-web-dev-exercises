package studios.resturaunt;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Menu {
//    should be able to
//    keep track of all menu items
//    add new menu items
//    remove menu items
//    keep track of when it's updated
    HashMap<MenuItem, Double> menuItems = new HashMap<>();
    LocalDateTime updatedDate = LocalDateTime.MIN;

//    getter and setter for single menuItem
//    add / subtract / view one item at a time
//    display list of items
    public void addMenuItem(MenuItem item){
        this.menuItems.put(item, item.getPrice());
        this.setUpdatedDate(LocalDateTime.now());
    }

    public void deleteMenuItem(MenuItem item){
        if(menuItems.containsKey(item)) {
            this.menuItems.remove(item);
        }
    }

    public void viewMenuItem(MenuItem item){
//        display menu item name: $price

        double price = this.menuItems.get(item);
        System.out.println(String.format("%s: $%s", item.getName(), price));
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String toString(){
        StringBuilder items = new StringBuilder();
        for(MenuItem item: this.menuItems.keySet()){
            items.append(String.format("\n%s", item.toString()));
        }
        return items.toString();
    }


}
