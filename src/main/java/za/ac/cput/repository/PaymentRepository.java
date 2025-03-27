package za.ac.cput.repository;

/*
 * Author: Sanele Zondi (221602011)
 * Date: 20/03/2025
 */

import za.ac.cput.domain.Payment;
import java.util.List;

public interface PaymentRepository extends IRepository<Payment, Integer> {
    List<Payment> getAll();
}
