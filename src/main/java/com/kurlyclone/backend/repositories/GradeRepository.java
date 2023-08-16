package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.Grade;

public interface GradeRepository extends JpaRepository<Grade, String> {
}
