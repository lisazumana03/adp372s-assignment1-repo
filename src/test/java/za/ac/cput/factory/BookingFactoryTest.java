package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    void createBooking() throws ParseException {

        Date startDate = dateFormat.parse("2025-3-12");
        Date endDate =  dateFormat.parse("2028-3-13");

        Booking booking = new Booking.Builder()
                .setBookingID(34)
                .setUserID(730)
                .setCarID(245)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setStatus("Booking Created!")
                .build();

        assertEquals(34, booking.getBookingID());
        assertEquals(730, booking.getUserID());
        assertEquals(245, booking.getCarID());
        assertEquals(startDate, booking.getStartDate());
        assertEquals(endDate, booking.getEndDate());
        assertEquals("Booking Created!", booking.getStatus());
        assertTrue(true);
        assertNotNull(booking);
    }

    @Test
    void cancelBooking() throws ParseException {
        Date startDate = dateFormat.parse("2025-3-12");
        Date endDate =  dateFormat.parse("2028-3-13");

        Booking booking = BookingFactory.createBooking(32, 345, 444, startDate, endDate, "Booking Created!");
        assertNotNull(booking);

        Booking bookingCancelled = BookingFactory.cancelBooking(booking);
        assertEquals(32, booking.getBookingID());
        assertEquals("Booking has been cancelled.", bookingCancelled.getStatus());
        assertNotNull(bookingCancelled);
    }

    @Test
    void confirmBooking() throws ParseException {
        Date startDate = dateFormat.parse("2025-3-12");
        Date endDate =  dateFormat.parse("2028-3-13");

        Booking booking = BookingFactory.createBooking(31, 631, 444, startDate, endDate, "Booking Created!");
        assertNotNull(booking);

        Booking bookingConfirmed = BookingFactory.confirmBooking(booking);
        assertEquals(31, booking.getBookingID());
        assertEquals(631, booking.getUserID());
        assertEquals(444, booking.getCarID());
        assertEquals("Booking has been confirmed.", bookingConfirmed.getStatus());
        assertNotNull(bookingConfirmed);
    }
}