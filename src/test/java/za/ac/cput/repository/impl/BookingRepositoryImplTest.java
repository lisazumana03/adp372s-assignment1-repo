package za.ac.cput.repository.impl;

/*
Author: Lisakhanya Zumana (230864821)
Date 26/03/2025
 */

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;
import za.ac.cput.repository.BookingRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookingRepositoryImplTest {

    private BookingRepository bookingRepository;
    private Booking booking;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    @BeforeEach
    void setUpRepository() throws ParseException {

        Date startDate = dateFormat.parse("2025-3-12");
        Date endDate = dateFormat.parse("2028-3-13");

        bookingRepository = BookingRepositoryImpl.getRepository();
        booking = BookingFactory.createBooking(34, 730, 245, startDate, endDate, "Booking created");
        bookingRepository.create(booking);
    }

    @Test
    @Order(1)
    void create() throws ParseException {

        Date startDate = dateFormat.parse("2025-3-12");
        Date endDate = dateFormat.parse("2028-3-13");


        Booking newBooking = BookingFactory.createBooking(34, 730, 245, startDate, endDate, "Booking created!");
        Booking bookingCreated = bookingRepository.create(newBooking);

        assertNotNull(bookingCreated);
        assertEquals(34, bookingCreated.getBookingID());
        assertEquals(730, bookingCreated.getUserID());
        assertEquals(245, bookingCreated.getCarID());
        assertEquals(startDate, bookingCreated.getStartDate());
        assertEquals(endDate, bookingCreated.getEndDate());
        assertEquals("Booking created!", bookingCreated.getStatus());
    }

    @Test
    @Order(2)
    void read() {
        Booking read = bookingRepository.read(booking.getBookingID());
        assertNotNull(read);
        assertEquals(booking.getBookingID(), read.getBookingID());
    }

    @Test
    @Order(3)
    void update() {
        bookingRepository.create(booking);

        Booking bookingUpdated = new Booking.Builder()
                .setBookingID(booking.getBookingID())
                .setUserID(booking.getUserID())
                .setCarID(booking.getCarID())
                .setStartDate(booking.getStartDate())
                .setEndDate(booking.getEndDate())
                .setStatus("Booking has been updated.")
                .build();
        Booking outcome = bookingRepository.update(bookingUpdated);
        assertNotNull(outcome);
        assertEquals("Booking has been updated.", outcome.getStatus());
    }

    @Test
    @Order(4)
    void delete() {
        bookingRepository.delete(booking.getBookingID());
        assertNull(bookingRepository.read(booking.getBookingID()));
    }
}