package Studio4;

public class MenuItem {
	private String name;
	private String price;
	private String description;
	private String category;
	private boolean ifNew;

	public MenuItem(String name, String price, String description, String category, boolean ifNew) {
		this.name= name;
		this.price= price;
		this.description= description;
		this.category= category;
		this.ifNew= true;
	}

	// getters
	public double getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public String getDescription() {
		return this.description;
	}

	public String getCategory() {
		return this.category;
	}

	public boolean ifNew() {
		return ifNew;
	}

	// setters
	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setifNew(boolean ifNew) {
		this.ifNew = ifNew;
	}
}
