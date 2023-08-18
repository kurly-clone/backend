package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.SearchLog;

public interface SearchLogRepository extends JpaRepository<SearchLog, Integer> {
}
