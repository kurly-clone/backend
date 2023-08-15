package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {
}
