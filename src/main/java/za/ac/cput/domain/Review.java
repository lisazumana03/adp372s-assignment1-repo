package za.ac.cput.domain;

/*
 * Olwethu Tshingo (222634383)
 * Date: 19/03/2025
 * */

public class Review {
    protected int reviewID;
    protected int userID;
    protected int carID;
    protected int rating;
    protected String comment;

    private Review() {
    }

    private Review(Builder builder) {
        this.reviewID = builder.reviewID;
        this.userID = builder.userID;
        this.carID = builder.carID;
        this.rating = builder.rating;
        this.comment = builder.comment;
    }

    public int getReviewID() {
        return reviewID;
    }

    public int getUserID() {
        return userID;
    }

    public int getCarID() {
        return carID;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public static class Builder{
        private int reviewID;
        private int userID;
        private int carID;
        private int rating;
        private String comment;

        public Builder setReviewID(int reviewID) {
            this.reviewID = reviewID;
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

        public Builder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }
    }
}
