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

    public List<Booking> getAll() {
        List<Booking> bookings = new ArrayList<>();
        return List.of();
    }

    @Override
    public Booking create(Booking booking) {
        if(booking == null || bookings.containsKey(booking.getBookingID())) {
            return null;
        }
        bookings.put(booking.getBookingID(), booking);
            return booking;
    }
    @Override
    public Booking read(Integer bookingID) {
        return bookings.get(bookingID);
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

    @Override
    public void delete(Integer bookingID) {
        bookings.remove(bookingID);
    }

}
