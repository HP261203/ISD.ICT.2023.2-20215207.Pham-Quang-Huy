package PayOrder;
import PlaceOrder.OrderInfo.TransactionInfo;
public interface IPayment {

	public abstract void payOrder(double amount, String orderInfo, Client client);

	public abstract TransactionInfo updateTransactionStatus(String response);

}
