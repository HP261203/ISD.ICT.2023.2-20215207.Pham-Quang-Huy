package PlaceOrder.Product;

public class Product {

	private char ID;

	private String Name;

	private int Category;

	private float Unit_price;

	private int Available_Quantity;

	public char getID() {
		return ID;
	}

	public void setID(char ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCategory() {
		return Category;
	}

	public void setCategory(int category) {
		Category = category;
	}

	public float getUnit_price() {
		return Unit_price;
	}

	public void setUnit_price(float unit_price) {
		Unit_price = unit_price;
	}

	public int getAvailable_Quantity() {
		return Available_Quantity;
	}

	public void setAvailable_Quantity(int available_Quantity) {
		Available_Quantity = available_Quantity;
	}

	public void update_product(char ID, String Name, int Category, float Unit_Price) {

	}

	public void update_product_price(float new_unit_price) {

	}

	public void update_product_quantity(int new_quantity) {

	}

}
