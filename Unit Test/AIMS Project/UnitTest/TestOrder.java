package UnitTest;
import PlaceOrder.OrderInfo.Order;
import PlaceOrder.OrderInfo.TransactionInfo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestOrder {
    @Test
    public void testUpdateTransactionInfo() {
        Order order = new Order();
        TransactionInfo tInfo = new TransactionInfo();
        order.updateTransactionInfo(tInfo);
        assertEquals(tInfo, order.getTransactionInfo());
    }
}
