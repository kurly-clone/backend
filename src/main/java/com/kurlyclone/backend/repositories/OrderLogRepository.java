package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.OrderLog;

public interface OrderLogRepository extends JpaRepository<OrderLog, Integer> {
}
