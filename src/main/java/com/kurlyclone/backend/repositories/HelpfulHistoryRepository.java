package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.HelpfulHistory;

public interface HelpfulHistoryRepository extends JpaRepository<HelpfulHistory, Integer> {
}
