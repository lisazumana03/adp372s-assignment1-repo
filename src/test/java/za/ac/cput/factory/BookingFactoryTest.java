package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void createBooking() {
        Booking booking = BookingFactory.createBooking(34,030, 245, );
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