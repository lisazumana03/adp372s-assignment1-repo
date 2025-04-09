package za.ac.cput.repository.impl;

/*
 * Olwethu Tshingo (222634383)
 * Date: 23/03/2025
 * */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Review;
import za.ac.cput.factory.ReviewFactory;
import za.ac.cput.repository.ReviewRepository;
import za.ac.cput.repository.ReviewRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

class ReviewRepositoryImplTest {

    private ReviewRepository reviewRepository;
    private Review review;

    void setUp() {
        reviewRepository = ReviewRepositoryImpl.getRepository();
        review = ReviewFactory.submitReview(2,21,10111,5,"Luxury car");
        reviewRepository.create(review);
    }

    @Test
    void create() {
        Review newReview = ReviewFactory.submitReview(2,21,10111,5,"Luxury car");
        reviewRepository.create(newReview);
        assertNotNull(newReview);
        assertEquals(2, newReview.getReviewID());

    }

    @Test
    void read() {
    }

    @Test
    void update() {

    }

    @Test
    void delete() {
        reviewRepository.delete(review.getReviewID());
        Review cancelledReview = reviewRepository.read(review.getReviewID());
        assertNull(cancelledReview);
    }
}