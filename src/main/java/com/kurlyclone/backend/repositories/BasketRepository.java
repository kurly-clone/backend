package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.Basket;

public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
