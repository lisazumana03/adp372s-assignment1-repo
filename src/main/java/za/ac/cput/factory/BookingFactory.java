package za.ac.cput.factory;

/*
 * Lisakhanya Zumana (230864821)
 * Date: 18/03/2025
 * */

import za.ac.cput.domain.Booking;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BookingFactory {

    private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private static Date convertToDate(Date date) {
        if(date == null){
            return null;
        }
        return new Date(date.getTime());
    }

    public static Booking createBooking(int bookingID, int userID, int carID, Date startDate, Date endDate, String status) {

        Date start = convertToDate(startDate);
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
        else if(status==null || status.isEmpty()){
            return null;
        }
        else {
            return new Booking.Builder().setBookingID(bookingID).setUserID(userID).setCarID(carID).setStartDate(startDate).setEndDate(endDate).setStatus(status).build();
        }
    }

    public static Booking cancelBooking(Booking booking) {
        return new Booking.Builder()
                .setBookingID(booking.getBookingID())
                .setUserID(booking.getUserID())
                .setCarID(booking.getCarID())
                .setStatus("Booking has been cancelled.")
                .build();
    }
    public static Booking confirmBooking(Booking booking) {
        return new Booking.Builder()
                .setBookingID(booking.getBookingID())
                .setUserID(booking.getUserID())
                .setCarID(booking.getCarID())
                .setStatus("Booking has been confirmed.")
                .build();
    }

}
