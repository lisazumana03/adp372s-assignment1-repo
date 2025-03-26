package za.ac.cput.factory;

/*
 * Author: Sanele Zondi (221602011)
 * Date: 20/03/2025
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void createPayment() {
        Payment payment = PaymentFactory.createPayment(1, "B123", 1500.00, "Credit Card");
        assertNotNull(payment);
        assertEquals(1, payment.getPaymentID());
        assertEquals("B123", payment.getBookingID());
        assertEquals(1500.00, payment.getAmount());
        assertEquals("Credit Card", payment.getPaymentMethod());
    }

    @Test
    void createInvalidPayment() {
        Payment payment = PaymentFactory.createPayment(-1, "", -500.00, "");
        assertNull(payment);
    }

    @Test
    void processRefund() {
        Payment originalPayment = PaymentFactory.createPayment(2, "B456", 2000.00, "EFT");
        Payment refundedPayment = PaymentFactory.processRefund(originalPayment);

        assertNotNull(refundedPayment);
        assertEquals("Refund", refundedPayment.getPaymentMethod());
    }
}
