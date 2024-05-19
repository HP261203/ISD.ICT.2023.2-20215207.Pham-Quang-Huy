package PlaceOrder.Product;

import PlaceOrder.OrderInfo.Order;
import java.util.ArrayList;
public class Cart {

	private ArrayList<Product> List_Of_Products;
	public ArrayList<Product> getList_Of_Products() {
		return List_Of_Products;
	}
	public void setList_Of_Products(ArrayList<Product> list_Of_Products) {
		List_Of_Products = list_Of_Products;
	}


	public boolean check_product_quantity() {
		for(Product p : List_Of_Products) {
			if(p.getAvailable_Quantity() == 0) return false;
		}
		return true;
	}

	public void addProduct(Product p) {
		this.List_Of_Products.add(p);
	}

	public void removeProduct(Product p) {
		this.List_Of_Products.remove(p);
	}
}
