package za.ac.cput.factory;
/*
 * Olwethu Tshingo (222634383)
 * Date: 23/03/2025
 * */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Review;

import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {
    private static Review r1 = ReviewFactory.submitReview(2,21,10111,5,"Luxury car");

    @Test
    public void submitReview() {
        assertNotNull(r1);
        System.out.println(r1.toString());
    }

    @Test
    public void editReview() {
        ReviewFactory reviewFactory = new ReviewFactory();
        assertNotNull(reviewFactory);
    }

    @Test
    public void deleteReview() {
        ReviewFactory reviewFactory = new ReviewFactory();
        assertNotNull(reviewFactory);
    }

}