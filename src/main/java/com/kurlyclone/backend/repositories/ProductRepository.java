package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
