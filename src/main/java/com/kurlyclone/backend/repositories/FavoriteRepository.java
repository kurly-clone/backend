package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
}
