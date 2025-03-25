package za.ac.cput.factory;

import za.ac.cput.domain.Review;

    public class ReviewFactory {
        public static Review submitReview(int reviewID, int userID, int carID, int rating, String comment){
            if(reviewID<0 || reviewID>1000000){
                return null;
            }
            else if(userID<0 || userID>1000000){
                return null;
            }
            else if(carID<0 || carID>1000000){
                return null;
            }
            else if(rating<0 || rating>5){
                return null;
            }
            else if(comment.isEmpty() || comment==null){
                return null;
            }
            else{
                return new Review.Builder().setReviewID(2).setUserID(3).setCarID(5).setRating(5).setComment("I love this vehicle").build();
            }
        }
    }


