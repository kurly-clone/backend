package com.kurlyclone.backend.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product productId;

	@Column(nullable = false, length = 2000)
	private String text;
	@Column(nullable = false)
	@ColumnDefault("0")
	private int helpfulCount;
	@Column(nullable = true)
	private String image;

	@Column(nullable = false)
	@CreationTimestamp
	@ColumnDefault("CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;
	@Column(nullable = false)
	@UpdateTimestamp
	@ColumnDefault("CURRENT_TIMESTAMP")
	private LocalDateTime updatedAt;
}
