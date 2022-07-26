package studios.resturaunt;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean newItemStatus;


    public MenuItem(String name, double price, String description, String category, boolean newItemStatus) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItemStatus = newItemStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItemStatus() {
        return newItemStatus;
    }

    public void setNewItemStatus(boolean newItemStatus) {
        this.newItemStatus = newItemStatus;
    }
}
