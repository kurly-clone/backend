package com.kurlyclone.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurlyclone.backend.entities.Inquiry;

public interface InquiryRepository extends JpaRepository<Inquiry, Integer> {
}
