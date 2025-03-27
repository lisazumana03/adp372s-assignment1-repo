package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void createBooking() {

        Date startDate = new Date(2025-3-12);
        Date endDate = new Date(2028-3-13);

        Booking booking = BookingFactory.createBooking(34,030, 245, startDate, endDate, "Booking approved! Congratulations!");
        assertEquals(34, booking.getBookingID());
        assertEquals(030, booking.getUserID());
        assertEquals(245, booking.getCarID());
        assertEquals(2025-3-12, booking.getStartDate());
        assertEquals(2028-3-13, booking.getEndDate());
        assertEquals("Booking approved! Congratulations!", booking.toString());
        assertNotNull(booking);
    }

    @Test
    void cancelBooking() {
        Booking booking = BookingFactory.cancelBooking(32, 034, 245, 2026-3-12);
    }

    @Test
    void confirmBooking() {
        BookingFactory bookingFactory = new BookingFactory();
        assertNotNull(bookingFactory);
    }
}