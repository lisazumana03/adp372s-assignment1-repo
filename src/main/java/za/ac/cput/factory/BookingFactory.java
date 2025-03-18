package za.ac.cput.factory;

import za.ac.cput.domain.Booking;

/*
* Lisakhanya Zumana (230864821)
* Date: 18/03/2025
* */

import java.util.Date;

public class BookingFactory {
    public static Booking createBooking(int bookingID, int userID, int carID, Date startDate, Date endDate, String status) {
        if(bookingID<0||bookingID>100000){
            return null;
        }
        else if(userID<0||userID>100000){
            return null;
        }
        else if(carID<0||carID>100000){
            return null;
        }
        else if(startDate==null||endDate==null){
            return null;
        }
        else if(status==null){
            return null;
        }
        else {
            return new Booking.Builder().setBookingID(bookingID).setUserID(userID).setCarID(carID).setStartDate(startDate).setEndDate(endDate).setStatus(status).build();
        }
    }

    public static Booking cancelBooking(Booking booking) {
        if(booking == null){
            return null;
        }
        return new Booking.Builder()
                .setBookingID(booking.getBookingID())
                .setStatus("Booking has been cancelled")
                .build();
    }
    public static Booking confirmBooking(Booking booking) {
        if(booking == null){
            return null;
        }
        return new Booking.Builder()
                .setBookingID(booking.getBookingID())
                .setUserID(booking.getUserID())
                .setCarID(booking.getCarID())
                .setStartDate(booking.getStartDate())
                .setEndDate(booking.getEndDate())
                .setStatus("Booking has been confirmed.")
                .build();
    }

}
