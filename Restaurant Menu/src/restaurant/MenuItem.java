package restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String category;
    private String description;

    public MenuItem(String name, double price,
                  String category,String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }
}
