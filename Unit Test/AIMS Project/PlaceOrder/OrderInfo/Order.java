package PlaceOrder.OrderInfo;

import PlaceOrder.Product.Cart;

public class Order {

	private Cart cart;

	private DeliveryInfo deliveryInfo;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}

	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	private TransactionInfo transactionInfo;

	public void Order(Cart cart, DeliveryInfo deliveryInfo) {

	}

	public boolean updateTransactionInfo(TransactionInfo transactionInfo) {
		return true;
	}

}
