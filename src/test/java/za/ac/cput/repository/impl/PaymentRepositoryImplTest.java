package za.ac.cput.repository.impl;

/*
 * Author: Sanele Zondi (221602011)
 * Date: 27/03/2025
 */

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.repository.PaymentRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PaymentRepositoryImplTest {

    private static PaymentRepository repository;
    private static Payment payment = PaymentFactory.createPayment(1001, "BKG12345", 2500.75, "Credit Card");

    @Test
    void getRepository() {
        assertNotNull(repository);
    }

    @Test
    void getAll() {
        repository.create(payment);
        assertFalse(repository.getAll().isEmpty());
    }

    @Test
    @Order(1)
    void create() {
        Payment created = repository.create(payment);
        assertNotNull(created);
        assertEquals(payment.getPaymentID(), created.getPaymentID());
    }

    @Test
    @Order(2)
    void read() {
        repository.create(payment);
        Payment read = repository.read(payment.getPaymentID());
        assertNotNull(read);
        assertEquals(payment.getPaymentID(), read.getPaymentID());
    }

    @Test
    @Order(3)
    void update() {
        repository.create(payment);
        Payment updatedPayment = new Payment.Builder()
                .copy(payment)
                .setAmount(3000.00)
                .build();

        Payment updated = repository.update(updatedPayment);
        assertNotNull(updated);
        assertEquals(3000.00, updated.getAmount());
    }

    @Test
    @Order(4)
    void delete() {
        repository.create(payment);
        repository.delete(payment.getPaymentID());
        Payment deleted = repository.read(payment.getPaymentID());
        assertNull(deleted);
    }
}

