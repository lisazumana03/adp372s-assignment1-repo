package za.ac.cput.factory;

/*
 * Lisakhanya Zumana (230864821)
 * Date: 18/03/2025
 * */

import za.ac.cput.domain.Booking;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BookingFactory {

    private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("YYYY-MM-DD");

    public static Booking createBooking(int bookingID, int userID, int carID, Date startDate, Date endDate, String status) {

        Date start = convertToData(startDate);
        Date end = convertToDate(endDate);

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
                .setStatus("Booking has been confirmed.")
                .build();
    }

    private static Date convertToDate(Date date) {
        if(date == null){
            return null;
        }
        return new Date(date.getTime());
    }

}
