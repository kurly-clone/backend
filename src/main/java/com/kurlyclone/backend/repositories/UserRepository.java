package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
