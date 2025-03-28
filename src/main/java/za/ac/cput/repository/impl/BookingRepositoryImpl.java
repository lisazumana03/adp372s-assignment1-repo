package za.ac.cput.repository.impl;

/*
* Author: Lisakhanya Zumana (230864821)
* Date: 18/03/2025
* */

import za.ac.cput.domain.Booking;
import za.ac.cput.repository.BookingRepository;

import java.util.HashMap;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl repo = null;
    private HashMap<Integer, Booking> bookings;

    private BookingRepositoryImpl() {
        this.bookings = new HashMap<>();
    }

    public static BookingRepository getRepository() {
        if (repo == null)
            repo = new BookingRepositoryImpl();
        return repo;
    }

    @Override
    public List<Booking> getAll() {
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
        if(booking == null || !bookings.containsKey(booking.getBookingID())) {
            return null;
        }
        bookings.put(booking.getBookingID(), booking);
        return booking;
    }

    @Override
    public void delete(Integer bookingID) {
        bookings.remove(bookingID);
    }

}
