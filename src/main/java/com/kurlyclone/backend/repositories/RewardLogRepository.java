package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.RewardLog;

public interface RewardLogRepository extends JpaRepository<RewardLog, Integer> {
}
