package za.ac.cput.repository;

/*
 * Author: Sanele Zondi (221602011)
 * Date: 20/03/2025
 */

import za.ac.cput.domain.Payment;
import za.ac.cput.repository.PaymentRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PaymentRepositoryImpl implements PaymentRepository {
    private static PaymentRepositoryImpl repo = null;
    private HashMap<Integer, Payment> payments;

    private PaymentRepositoryImpl() {
        this.payments = new HashMap<>();
    }

    public static PaymentRepository getRepository() {
        if (repo == null) repo = new PaymentRepositoryImpl();
        return repo;
    }

    @Override
    public List<Payment> getAll() {
        return new ArrayList<>(payments.values());
    }

    @Override
    public Payment create(Payment payment) {
        if (payment == null || payments.containsKey(payment.getPaymentID())) {
            return null;
        }
        payments.put(payment.getPaymentID(), payment);
        return payment;
    }

    @Override
    public Payment read(Integer paymentID) {
        return payments.get(paymentID);
    }

    @Override
    public Payment update(Payment payment) {
        if (payment == null || !payments.containsKey(payment.getPaymentID())) {
            return null;
        }
        payments.put(payment.getPaymentID(), payment);
        return payment;
    }

    @Override
    public void delete(Integer paymentID) {
        payments.remove(paymentID);
    }
}
