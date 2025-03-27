package za.ac.cput.repository;

/*
Author: Lisakhanya Zumana (230864821)
Date 26/03/2025
 */

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookingRepositoryImplTest {

    private static BookingRepository bookingRepository = new BookingRepositoryImpl();
    private static Booking booking = BookingFactory.createBooking(34, 230, 245, 2025-3-12, 2028-3-12, "Booking approved! Congratulations!");

    @Test
    void getRepository() {
    }

    @Test
    void getAll() {
    }

    @Test
    @Order(1)
    void create() {

    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}