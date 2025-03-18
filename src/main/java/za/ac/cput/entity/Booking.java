package za.ac.cput.entity;

public class Booking {
    protected int booking_id;

    private Booking(int booking_id) {
        this.booking_id = booking_id;
    }
    public int getBooking_id() {
        return booking_id;
    }

}
