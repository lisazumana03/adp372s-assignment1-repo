package za.ac.cput.repository;

import za.ac.cput.domain.Booking;
import za.ac.cput.repository.BookingRepository;

import java.util.HashMap;

public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl repo = null;
    private HashMap<Integer, Booking> bookings = new HashMap<>();

    private BookingRepositoryImpl() {
        this.bookings = new HashMap<>();
    }

        public static BookingRepository getRepository() {
        if (repo == null) {
            repo = new BookingRepositoryImpl();
        }
    }

    public static BookingRepository getBookingRepository() {
        return new BookingRepositoryImpl();
    }
}
