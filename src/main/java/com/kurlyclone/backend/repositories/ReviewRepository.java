package com.kurlyclone.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.Product;
import com.kurlyclone.backend.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
	List<Review> findByProductId(Product product);
}
