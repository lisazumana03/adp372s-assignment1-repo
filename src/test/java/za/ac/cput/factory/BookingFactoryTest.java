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
    }

    @Test
    void cancelBooking() {
        BookingFactory bookingFactory = new BookingFactory();
        assertNotNull(bookingFactory);
    }

    @Test
    void confirmBooking() {
        BookingFactory bookingFactory = new BookingFactory();
        assertNotNull(bookingFactory);
    }
}