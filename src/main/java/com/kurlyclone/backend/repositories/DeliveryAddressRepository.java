package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.DeliveryAddress;

public interface DeliveryAddressRepository extends JpaRepository<DeliveryAddress, Integer> {
}
