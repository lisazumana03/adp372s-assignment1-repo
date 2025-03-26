package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl repo = null;
    private HashMap<Integer, Booking> bookings = new HashMap<>();

    private BookingRepositoryImpl() {
        this.bookings = new HashMap<>();
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
        public Booking create(Booking booking) {
            if(booking == null ){
                return null;
            }
            return booking;
        }

        @Override
        public Booking read(Booking booking) {
            return null;
        }

        @Override
        public Booking update(Booking booking) {
            return null;
        }

        @Override
        public void delete(Booking booking) {
            bookings.remove(booking.getBookingID());
        }
}
