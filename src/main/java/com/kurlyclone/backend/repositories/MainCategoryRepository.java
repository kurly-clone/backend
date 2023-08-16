package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.MainCategory;

public interface MainCategoryRepository extends JpaRepository<MainCategory, Integer> {
}
