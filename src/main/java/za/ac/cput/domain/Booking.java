package za.ac.cput.domain;

import java.util.Date;
import java.util.Locale;

public class Booking {
    protected int bookingID;
    protected int userID;
    protected int carID;
    protected Date startDate;
    protected Date endDate;
    protected String status;

    private Booking(Builder builder){
        this.bookingID = builder.bookingID;
        this.userID = builder.userID;
        this.carID = builder.carID;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.status = builder.status;
    }

    public int getBookingID() {
        return bookingID;
    }
    public int getUserID() {
        return userID;
    }
    public int getCarID() {
        return carID;
    }
    public Date getStartDate() {
        return startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public String getStatus() {
        return status;
    }

    public static class Builder {
        private int bookingID;
        private int userID;
        private int carID;
        private Date startDate;
        private Date endDate;
        private String status;

        public Builder setBookingID(int bookingID) {
            this.bookingID = bookingID;
            return this;
        }
        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }
        public Builder setCarID(int carID) {
            this.carID = carID;
            return this;
        }
        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }
        public Booking build(){
            return new Booking(this);
        }

    }
}
