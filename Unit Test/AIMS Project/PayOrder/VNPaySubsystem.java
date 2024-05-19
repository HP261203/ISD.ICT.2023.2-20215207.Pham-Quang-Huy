package PayOrder;
import PlaceOrder.OrderInfo.TransactionInfo;
public class VNPaySubsystem implements IPayment {


	/**
	 * @see PayOrder.IPayment#payOrder(double, String, Client)
	 */
	public void payOrder(double amount, String orderInfo, Client client) {

	}


	/**
	 * @see PayOrder.IPayment#updateTransactionStatus(String)
	 */
	public TransactionInfo updateTransactionStatus(String response) {
		return null;
	}

}
