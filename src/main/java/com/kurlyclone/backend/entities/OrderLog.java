package com.kurlyclone.backend.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Enumerated(EnumType.ORDINAL)
	@Column(nullable = false, columnDefinition = "INT DEFAULT 0")
	private OrderStatus status;

	public enum OrderStatus {
		READY, COMPLETED, IN_TRANSIT, DELIVERED
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product productId;

	@Column(nullable = false)
	private int amount;

	@Column(nullable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
}
