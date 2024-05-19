package UnitTest;
import PlaceOrder.DeliveryForm;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestDeliveryForm {
    @Test
    public void testEnterAndSubmitInfo() {
        DeliveryForm deliverForm = new DeliveryForm();
        assertEquals(true, deliverForm.enter_and_submit_delivery_info());
    }
}
