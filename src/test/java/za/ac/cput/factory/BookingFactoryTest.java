package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void createBooking() {
        BookingFactory bookingFactory = new BookingFactory();
        assertNotNull(bookingFactory);
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