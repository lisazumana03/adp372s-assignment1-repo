/*
 * Sanele Zondi (221602011)
 * Date: 20/03/2025
 * */

package za.ac.cput.factory;
import za.ac.cput.domain.Payment;
public class PaymentFactory {

        public static Payment createPayment(int paymentID, String bookingID, double amount, String paymentMethod) {
            if (paymentID < 0 || paymentID > 100000) {
                return null;
            }
            if (bookingID == null || bookingID.isEmpty()) {
                return null;
            }
            if (amount < 0) {
                return null;
            }
            if (paymentMethod == null || paymentMethod.isEmpty()) {
                return null;
            }

            return new Payment.Builder()
                    .setPaymentID(paymentID)
                    .setBookingID(bookingID)
                    .setAmount(amount)
                    .setPaymentMethod(paymentMethod)
                    .build();
        }

        public static Payment processRefund(Payment payment) {
            if (payment == null) {
                return null;
            }
            return new Payment.Builder()
                    .copy(payment)
                    .setPaymentMethod("Refund")
                    .build();
        }
    }

