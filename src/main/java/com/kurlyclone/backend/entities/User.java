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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String userId;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(name = "grade")
	private Grade grade;
	@Column(nullable = false)
	@ColumnDefault("0")
	private int reward;

	@Column(nullable = true)
	private int birthYear;
	@Column(nullable = true)
	private char gender;
	@Column(nullable = true)
	private String phoneNumber;
	@Column(nullable = true)
	private String email;

	@Column(nullable = false)
	@CreationTimestamp
	@ColumnDefault("CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;
	@Column(nullable = false)
	@UpdateTimestamp
	@ColumnDefault("CURRENT_TIMESTAMP")
	private LocalDateTime updatedAt;
}
