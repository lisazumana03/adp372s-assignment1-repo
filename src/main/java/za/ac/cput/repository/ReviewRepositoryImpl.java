package za.ac.cput.repository;
/*
 * Olwethu Tshingo (222634383)
 * Date: 25/03/2025
 * */


import za.ac.cput.domain.Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReviewRepositoryImpl implements ReviewRepository {

    private static ReviewRepositoryImpl repo = null;
    private HashMap<Integer, Review> reviews = new HashMap<>();

    private ReviewRepositoryImpl() {
        this.reviews = new HashMap<>();
    }

    public static ReviewRepositoryImpl getRepository() {
        if (repo == null) repo = new ReviewRepositoryImpl();
        return repo;
    }
    public List<Review> getAll() {
        List<Review> reviews = new ArrayList<>();
        return List.of();
    }

    @Override
    public Review create(Review review) {
        if(review == null || reviews.containsKey(review.getReviewID())) {
            return null;
        }
        reviews.put(review.getReviewID(), review);
        return review;
    }

    @Override
    public Review read(Integer reviewID) {
        return reviews.get(reviewID);
    }

    @Override
    public Review update(Review review) {
        if(review == null || reviews.containsKey(review.getReviewID())) {
            return null;
        }
        reviews.put(review.getReviewID(), review);
        return review;
    }

    @Override
    public void delete(Integer reviewID) {
        reviews.remove(reviewID);
    }

}
