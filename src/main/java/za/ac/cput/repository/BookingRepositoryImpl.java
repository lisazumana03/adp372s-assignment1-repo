package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl repo = null;
    private HashMap<Integer, Booking> bookingDB = new HashMap<>();

    private BookingRepositoryImpl() {
        this.bookingDB = new HashMap<>();
    }

        public static BookingRepository getRepository() {
            if (repo == null) repo = new BookingRepositoryImpl();
            return repo;
        }

        public List<Booking> findAll() {
            List<Booking> bookings = new ArrayList<>();
            return List.of();
        }

        @Override
        public Booking create(Integer integer) {
            return null;
        }

        @Override
        public Booking read(Integer integer) {
            return null;
        }

        @Override
        public Booking update(Booking booking) {
            return null;
        }

        @Override
        public void delete(Booking booking) {
            bookingDB.remove(booking.getBookingID());
        }
}
