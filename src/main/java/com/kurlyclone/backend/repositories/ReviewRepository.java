package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
