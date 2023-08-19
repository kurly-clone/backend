package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.ProductInfo;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {
}
