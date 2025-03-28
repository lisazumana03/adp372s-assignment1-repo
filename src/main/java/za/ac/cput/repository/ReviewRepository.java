package za.ac.cput.repository;
/*
 * Olwethu Tshingo (222634383)
 * Date: 25/03/2025
 * */

import za.ac.cput.domain.Review;

import java.util.List;

public interface ReviewRepository extends IRepository<Review, Integer>{
        List<Review> getAll();
    }
