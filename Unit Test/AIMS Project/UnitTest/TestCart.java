package UnitTest;
import PlaceOrder.Product.Book;
import PlaceOrder.Product.CD;
import PlaceOrder.Product.Cart;
import PlaceOrder.Product.Product;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestCart {
    @Test
    public void testCheckItemQuantity() {
        CD cd1 = new CD();
        cd1.setAvailable_Quantity(0);
        Book b2 = new Book();
        b2.setAvailable_Quantity(1);
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(cd1);
        productList.add(b2);
        Cart testCart = new Cart();
        testCart.setList_Of_Products(productList);
        assertEquals(false, testCart.check_product_quantity());
    }

    @Test
    public void testSetListOfProduct() {
        CD cd1 = new CD();
        cd1.setAvailable_Quantity(0);
        Book b2 = new Book();
        b2.setAvailable_Quantity(1);
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(cd1);
        productList.add(b2);
        Cart testCart = new Cart();
        testCart.setList_Of_Products(productList);
        assertEquals(productList, testCart.getList_Of_Products());
    }
    @Test
    public void testAddProduct() {
        CD cd1 = new CD();
        cd1.setAvailable_Quantity(0);
        Book b2 = new Book();
        b2.setAvailable_Quantity(1);
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(cd1);
        Cart testCart = new Cart();
        testCart.setList_Of_Products(productList);
        testCart.addProduct(b2);
        assertEquals(productList, testCart.getList_Of_Products());
    }
}
